<script type="text/ng-template" id="editFlight.html">
			<div class="modal-header">
				<button type="button" class="close hidden-xs" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-times"></i>
				</button>

				<button class="yt-btn pull-left btn-sm visible-xs btn-back mr-5" type="button" data-dismiss="modal" ng-click="dismiss();">
					<i class="fa fa-chevron-left"></i>
				</button>

				<h3 class="modal-title">Add/Edit Flight</h3>				
			</div>
			<div class="modal-body">
                  	<div class="" ng-repeat="legg in flight.details.legs">
						<label>
                    	<span class="ico-radio">
                    	<input type="radio" value="departure" id="optionsRadios1" ng-model="legg.tripType" name="travelWay{{$index}}"><span class="ico-radio-active"></span></span>
                    	Departure
                  	</label>
                  	<label>
                    	<span class="ico-radio">
                    	<input type="radio" value="return" id="optionsRadios2" ng-model="legg.tripType" name="travelWay{{$index}}"><span class="ico-radio-active"></span></span>
                    	Return	
                  	</label>
					<div class="form-group row">
						<label for="flight" class=" col-md-3">From: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" name="" ng-model="legg.originIataName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label for="flight" class=" col-md-3">To: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" ng-model="legg.destinationIataName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label for="flight" class=" col-md-3">Airline: </label>
						<div class="col-md-5">
							<div class="my-inp fa fa-search block">
								<input type="text" class="form-control" ng-model="legg.carrierName">
							</div>
						</div>
					</div>
					<div class="form-group row">
						<label for="airline no" class=" col-xs-12 col-md-3">Airline No: </label>
						<div class="col-xs-12 col-md-5">
							<input type="text" id="airline-no" class="form-control" value="" placeholder="" ng-model="legg.carrierNum">
						</div>						
					</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-md-12" style="text-align:right;">
							<button class="yt-btn" ng-click="updateFlightLeg(flight)">Add Another Segment</button>
						</div>						
					</div>
			</div>
			<div class="modal-footer text-center">
				<button class="yt-btn" ng-click="updateFlight(flight,addNewFlag)">Update</button>
			</div>
		</script>