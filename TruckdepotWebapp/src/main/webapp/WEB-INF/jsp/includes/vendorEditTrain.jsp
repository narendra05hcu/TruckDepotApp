<script type="text/ng-template" id="editTrain.html">
			<div class="modal-header">
				<button type="button" class="close hidden-xs" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-times"></i>
				</button>

				<button class="yt-btn pull-left btn-sm visible-xs btn-back mr-5" type="button" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-chevron-left"></i>
				</button>

				<h3 class="modal-title">Add/Edit Train</h3>				
			</div>
			<div class="modal-body">
				<div class="yt-info" ng-repeat="segment in train.details.segments">
					<div class="form-group row">
						<label  class=" col-md-3">Leaving From: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" ng-model="segment.originIataName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label class=" col-md-3">Going To: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" ng-model="segment.destinationIataName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label class=" col-md-3">Train Name: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" ng-model="segment.carrierName">
							</div>
						</div>						
					</div>
					<div class="form-group row">
						<label  class=" col-md-3">Train Number: </label>
						<div class="col-md-5">
							<input type="text" class="form-control" ng-model="segment.carrierNum">
						</div>
					</div>
					<div class="form-group row">
						<label  class=" col-md-3">Class: </label>
						<div class="col-md-5 form-select">
							<select class="form-control my-select"  ng-model="segment.class">
								<option value="1 AC">1 AC</option>
								<option value="2 AC">2 AC</option>
								<option value="3 AC">3 AC</option>
								<option value="AC Chair Car">AC Chair Car</option>
								<option value="Sleeper">Sleeper</option>
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer text-center">
				<button class="yt-btn" ng-click="updateTrain(train,addNewFlag)">Update</button>
			</div>
		</script>