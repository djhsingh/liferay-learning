<div class="easy-layout" id="main-content" role="main">
	<div class="portlet-layout row">
		<div class="col-md-6 portlet-column portlet-column-first" id="column-1">
			${processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")}
		</div>
		<div class="col-md-6 portlet-column portlet-column-last" id="column-2">
			${processor.processColumn("column-2", "portlet-column-content portlet-column-content-last")}
		</div>
	</div>
	<div class="portlet-layout row">
		<div class="col-md-4 portlet-column portlet-column-first" id="column-3">
			${processor.processColumn("column-3", "portlet-column-content portlet-column-content-first")}
		</div>
		<div class="col-md-4 portlet-column" id="column-4">
			${processor.processColumn("column-4", "portlet-column-content")}
		</div>
		<div class="col-md-4 portlet-column portlet-column-last" id="column-5">
			${processor.processColumn("column-5", "portlet-column-content portlet-column-content-last")}
		</div>
	</div>
	<div class="portlet-layout row">
		<div class="col-md-3 portlet-column portlet-column-first" id="column-6">
			${processor.processColumn("column-6", "portlet-column-content portlet-column-content-first")}
		</div>
		<div class="col-md-3 portlet-column" id="column-7">
			${processor.processColumn("column-7", "portlet-column-content")}
		</div>
		<div class="col-md-3 portlet-column" id="column-8">
			${processor.processColumn("column-8", "portlet-column-content")}
		</div>
		<div class="col-md-3 portlet-column portlet-column-last" id="column-9">
			${processor.processColumn("column-9", "portlet-column-content portlet-column-content-last")}
		</div>
	</div>
	<div class="portlet-layout row">
		<div class="col-md-12 portlet-column portlet-column-only" id="column-10">
			${processor.processColumn("column-10", "portlet-column-content portlet-column-content-only")}
		</div>
	</div>
</div>
