$('#fileUpload').validate({
	rules: {
		excelFile: {
			required: true
		}
	},
	messages: {
		excelFile: {
		required: "*Please submit an excel file"
		}
	}
});
$(document).ready(function() {
	var table = $('#users-table').DataTable({
		autoWidth: false,
		"responsive": true,
		ajax:
		{
			type: "post",
			url: "DashboardController",
			dataType: "JSON",
			error: function(xhr, error, code) {
				console("Status: " + xhr.status + " Error: " + xhr.statusText);
			}
		},
		columns: [
			{
				'data': 'id',
				className: 'dt-body-center'
			},
			{
				'data': 'name',
				className: 'dt-body-center'
			},
			{
				'data': 'email',
				className: 'dt-body-center'
			},
			{
				'data': 'phone',
				className: 'dt-body-center'
			},
			{
				'data': 'gender',
				className: 'dt-body-center'
			},
			{
				'data': 'game',
				className: 'dt-body-center'
			}
		],
		"columnDefs": [
			{
				"targets": 6,
				className: 'dt-body-center',
				"render": function(data, type, row, meta) {
					return '<form action="UserDataController" method="post"><input type="text" name="id" value="' + row.id + '" hidden><input type="submit" class="btn btn-sm btn-warning" value="Edit"> </form>';
				}
			},
			{
				"targets": 7,
				className: 'dt-body-center',
				"render": function(data, type, row, meta) {
					return '<button class="btn btn-sm btn-danger" name="delBtn" id="' + row.id + '" onclick="deleteUser(this)">Delete</button>';
				}
			}
		]
	});
});

function deleteUser(obj) {
	var id = $(obj).attr('id');
	$.ajax({
		type: "post",
		url: "DeleteController",
		data: {
			"id": id
		},
		success: function() {
			$('#users-table').DataTable().ajax.reload();
		},
		error: function(xhr, error) {
			console.log(xhr.status + " " + error);
		}
	});
}

