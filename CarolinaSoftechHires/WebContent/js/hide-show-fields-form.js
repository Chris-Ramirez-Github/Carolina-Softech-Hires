$("#EmploymentField").change(function() {
			if ($(this).val() == "1") {
				$('#HireeField').show();
				$('#HireeField').attr('required','');
				$('#HireeField').attr('data-error', 'This field is required.');
				
				$('#HirerField').hide();
				$('#HirerField').removeAttr('required');
				$('#HirerField').removeAttr('data-error');	
			}
			else if ($(this).val() == "0") {
				$('#HirerField').show();
				$('#HirerField').attr('required','');
				$('#HirerField').attr('data-error', 'This field is required.');
				
				
				$('#HireeField').hide();
				$('#HireeField').removeAttr('required');
				$('#HireeField').removeAttr('data-error');	
				

			}

			else {
				
				
				$('#HireeField').hide();
				$('#HireeField').removeAttr('required');
				$('#HireeField').removeAttr('data-error');	
				
				$('#HirerField').hide();
				$('#HirerField').removeAttr('required');
				$('#HirerField').removeAttr('data-error');
				
			}
		});
		$("#EmploymentField").trigger("change");
