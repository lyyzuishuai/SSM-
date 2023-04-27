n.defaults = {
    aaData: null,
    aaSorting: [[0, "asc"]],
    aaSortingFixed: [],
    ajax: null,
    aLengthMenu: [5, 10, 25, 50, 100],
    aoColumns: null,
    aoColumnDefs: null,
    aoSearchCols: [],
    asStripeClasses: null,
    bAutoWidth: !0,
    bDeferRender: !1,
    bDestroy: !1,
    bFilter: !0,
    bInfo: !0,
    bLengthChange: !0,
    bPaginate: !0,
    bProcessing: !1,
    bRetrieve: !1,
    bScrollCollapse: !1,
    bServerSide: !1,
    bSort: !0,
    bSortMulti: !0,
    bSortCellsTop: !1,
    bSortClasses: !0,
    bStateSave: !1,
    fnCreatedRow: null,
    fnDrawCallback: null,
    fnFooterCallback: null,
    fnFormatNumber: function (a) {
        return a.toString().replace(/\B(?=(\d{3})+(?!\d))/g, this.oLanguage.sThousands)
    },
    fnHeaderCallback: null,
    fnInfoCallback: null,
    fnInitComplete: null,
    fnPreDrawCallback: null,
    fnRowCallback: null,
    fnServerData: null,
    fnServerParams: null,
    fnStateLoadCallback: function (a) {
        try {
            return JSON.parse((-1 === a.iStateDuration ? sessionStorage : localStorage).getItem("DataTables_" +
                a.sInstance + "_" + location.pathname))
        } catch (b) {
        }
    },
    fnStateLoadParams: null,
    fnStateLoaded: null,
    fnStateSaveCallback: function (a, b) {
        try {
            (-1 === a.iStateDuration ? sessionStorage : localStorage).setItem("DataTables_" + a.sInstance + "_" + location.pathname, JSON.stringify(b))
        } catch (c) {
        }
    },
    fnStateSaveParams: null,
    iStateDuration: 7200,
    iDeferLoading: null,
    iDisplayLength: 10,
    iDisplayStart: 0,
    iTabIndex: 0,
    oClasses: {},
    oLanguage: {
        oAria: {
            sSortAscending: ": activate to sort column ascending",
            sSortDescending: ": activate to sort column descending"
        },
        oPaginate: {sFirst: "First", sLast: "Last", sNext: "Next", sPrevious: "Previous"},
        sEmptyTable: "No data available in table",
        sInfo: "Showing _START_ to _END_ of _TOTAL_ entries",
        sInfoEmpty: "Showing 0 to 0 of 0 entries",
        sInfoFiltered: "(filtered from _MAX_ total entries)",
        sInfoPostFix: "",
        sDecimal: "",
        sThousands: ",",
        sLengthMenu: "Show _MENU_ entries",
        sLoadingRecords: "Loading...",
        sProcessing: "Processing...",
        sSearch: "Search:",
        sSearchPlaceholder: "",
        sUrl: "",
        sZeroRecords: "No matching records found"
    },
    oSearch: h.extend({},
        n.models.oSearch),
    sAjaxDataProp: "data",
    sAjaxSource: null,
    sDom: "lfrtip",
    searchDelay: null,
    sPaginationType: "simple_numbers",
    sScrollX: "",
    sScrollXInner: "",
    sScrollY: "",
    sServerMethod: "GET",
    renderer: null,
    rowId: "DT_RowId"
};