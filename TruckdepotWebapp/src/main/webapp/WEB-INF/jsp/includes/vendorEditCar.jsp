		 <script type="text/ng-template" id="editCar.html">
			<div class="modal-header">
				<button type="button" class="close hidden-xs" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-times"></i>
				</button>
				<button class="yt-btn pull-left btn-sm visible-xs btn-back mr-5" type="button" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-chevron-left"></i>
				</button>

				<h3 class="modal-title">Add/Edit Car</h3>				
			</div>
			<div class="modal-body">
				<div class="yt-info">
					<div class="form-group row">
						<label class=" col-md-3">Transfer: </label>
						<div class="col-md-5">
							<select class="form-control my-select" ng-model="car.details.category">
								<option value="transferonly">Transfer Only</option>
								<option value="allTours">All Tours and Travels</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label class=" col-md-3">Transfer Type: </label>
						<div class="col-md-5">
							<select class="form-control my-select"  ng-model="car.details.type">
								<option value="One Way">One Way</option>
								<option value="Round Trip">Round Trip</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label class=" col-md-3">Transfer By: </label>
						<div class="col-md-5">
							<select class="form-control my-select" ng-model="car.details.transferBy">
								<option value="Personal Car">Personal Car</option>
								<option value="Shared Car">Shared Car</option>
								<option value="Seat in Coach">Seat in Coach</option>
							</select>
						</div>	
					</div>
					<div class="form-group row">
						<label class=" col-md-3">AC: </label>
						<div class="col-md-5">
							<select class="form-control my-select" ng-model="car.details.hasAC">
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>
						</div>						
					</div>
				</div>
			</div>
			<div class="modal-footer text-center" ng-click="updateCar(car,addNewFlag);">
				<button class="yt-btn">Update</button>
			</div>
		</script>