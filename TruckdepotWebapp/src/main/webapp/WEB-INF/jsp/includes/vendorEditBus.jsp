<script type="text/ng-template" id="editBus.html">
			<div class="modal-header">
				<button type="button" class="close hidden-xs" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-times"></i>
				</button>
				<button class="yt-btn pull-left btn-sm visible-xs btn-back mr-5" type="button" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-chevron-left"></i>
				</button>
				<h3 class="modal-title">Add/Edit Bus</h3>				
			</div>
			<div class="modal-body">
				<div class="yt-info">
					<div class="form-group row">
						<label for="flight" class=" col-md-3">Leaving From: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" ng-model="bus.details.originMagnumCityName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label for="title" class=" col-md-3">Going To: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control"  ng-model="bus.details.destinationMagnumCityName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label class=" col-md-3">Bus Type: </label>
						<div class="col-md-5">
							<select class="form-control my-select" ng-model="bus.details.busType">
								<option value="Volvo">Volvo</option>
								<option value="AC">AC</option>
								<option value="Non AC">Non AC</option>
								<option value="AC Sleeper">AC Sleeper</option>
								<option value="Sleeper">Sleeper</option>
							</select>
						</div>						
					</div>
				</div>
			</div>
			<div class="modal-footer text-center">
				<button class="yt-btn" ng-click="updateBus(bus,addNewFlag)">Update</button>
			</div>
		</script>