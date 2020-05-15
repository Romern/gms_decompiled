package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bqbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqbd implements bxvp {
    UNKNOWN(0),
    SLURP_USAGE_REPORTS(1),
    READ_UPDATED_ACCOUNTS(2),
    APP_HISTORY_EVENT_UPLOAD(3),
    CLEAR_APP_INDEXING_SEQUENCE_TABLES_TASK(4),
    ON_SLEEP_ACTIONS(5),
    INDEX_WORKER(6),
    UPDATE_INDEX_INTERNALLY(7),
    INIT_STATIC_CONTEXT(8),
    CREATE_WORK_CONNECTION(9),
    CLEAR_USAGE_REPORT_DATA_INTERNAL(10),
    DIAGNOSTIC_UPLOAD_CONTACTS(11),
    UPDATE_APP_PARAMS(12),
    REGISTER_CORPUS_INFO(13),
    UNREGISTER_CORPUS(14),
    SET_GLOBAL_SEARCH_INFO(15),
    BLOCK_PACKAGES(16),
    UNBLOCK_PACKAGES(17),
    CLEAR_CORPUS_DATA(18),
    GET_APP_INDEXING_SERVICE(19),
    GET_CLIENT_SERVICE_INTERFACE(20),
    CHECK_CLIENT_RESOURCES(21),
    SCHEDULE_INDEXING(22),
    HANDLE_GCM_MESSAGE(23),
    INIT_INDEX_MANAGER(24),
    DESTROY_INDEX_MANAGER(25),
    HANDLE_PACKAGE_MANAGER_BROADCAST(26),
    HANDLE_DEVICE_STORAGE_OK(27),
    HANDLE_GSERVICES_CHANGED(28),
    COMMIT_INDEX(29),
    FLUSH_INDEX(30),
    REBUILD_INDEX(31),
    COMPACT_INDEX(32),
    COMPACT_AND_PURGE_INDEX(33),
    INDEX_MAINTENANCE(34),
    RETRY_FAILED_INDEXING_CORPORA(35),
    UPDATE_NATIVE_CONFIG(36),
    RESTORE_INDEX(37),
    READ_CLIENT_INFO_FROM_RESOURCES(38),
    REPARSE_GLOBAL_SEARCH_SECTION_MAPPINGS(39),
    CLEAR_APP_DATA(40),
    LOG_API_TRACE_EVENTS(41),
    CONTENT_FETCH(42),
    CLEAR_DEBUG_UI_CACHE(43),
    CLEAR_USAGE_REPORT_DATA(44),
    DIAGNOSTIC(45),
    GET_APP_INDEXING_PACKAGE_DETAILS(46),
    GET_APP_INDEXING_PACKAGES(47),
    GET_STORAGE_STATS(48),
    REQUEST_APP_INDEXING_UPDATE_INDEX(49),
    CLEAR_CORPUS(50),
    DELETE_USAGE_REPORT(51),
    GET_CORPUS_INFO(52),
    GET_CORPUS_STATUS(53),
    ANNOTATE(54),
    REQUEST_INDEXING(55),
    GET_CURRENT_EXPERIMENT_IDS(56),
    GET_GLOBAL_SEARCH_SOURCES(57),
    GET_PENDING_EXPERIMENT_IDS(58),
    SET_EXPERIMENT_IDS(59),
    SET_INCLUDE_IN_GLOBAL_SEARCH(60),
    GET_CORPUS_HANDLES_REGISTERED_FOR_IME(61),
    GET_IME_UPDATES(62),
    GET_NATIVE_API_INFO(63),
    GET_DOCUMENTS(64),
    GET_PHRASE_AFFINITY(65),
    GLOBAL_QUERY(66),
    QUERY_SUGGEST(67),
    QUERY(68),
    BATCH_TASK(69),
    APP_INDEXING_MUTATE(70),
    APP_INDEXING_UPDATE(71),
    APP_INDEXING_PATCH(72),
    APP_INDEXING_REMOVE(73),
    APP_INDEXING_REMOVE_ALL(74),
    APP_INDEXING_REMOVE_TYPES(75),
    APP_INDEXING_UPDATE_TAGS(76),
    APP_INDEXING_GET(77),
    APP_INDEXING_SEARCH(78),
    LOG_QUERY_STATS(79),
    LOG_ANNOTATION_API_STATS(80),
    APP_INDEXING_HANDLE_PACKAGE_REMOVAL(81),
    RETRIEVE_SLICE(82),
    APP_INDEXING_REPORT_USER_ACTION(83),
    USER_ACTIONS_SYNC_DELETION_DOWNLOADS(84),
    DRAIN_REQUEST_QUEUE(85),
    USER_ACTIONS_PUSH_NOTIFICATIONS_HANDLE(86),
    USER_ACTIONS_UPLOAD_ACCOUNT_CHANGE(87),
    UNRECOGNIZED(-1);
    

    /* renamed from: aL */
    private final int f140302aL;

    private bqbd(int i) {
        this.f140302aL = i;
    }

    /* renamed from: a */
    public static bqbd m112500a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SLURP_USAGE_REPORTS;
            case 2:
                return READ_UPDATED_ACCOUNTS;
            case 3:
                return APP_HISTORY_EVENT_UPLOAD;
            case 4:
                return CLEAR_APP_INDEXING_SEQUENCE_TABLES_TASK;
            case 5:
                return ON_SLEEP_ACTIONS;
            case 6:
                return INDEX_WORKER;
            case 7:
                return UPDATE_INDEX_INTERNALLY;
            case 8:
                return INIT_STATIC_CONTEXT;
            case 9:
                return CREATE_WORK_CONNECTION;
            case 10:
                return CLEAR_USAGE_REPORT_DATA_INTERNAL;
            case 11:
                return DIAGNOSTIC_UPLOAD_CONTACTS;
            case 12:
                return UPDATE_APP_PARAMS;
            case 13:
                return REGISTER_CORPUS_INFO;
            case 14:
                return UNREGISTER_CORPUS;
            case 15:
                return SET_GLOBAL_SEARCH_INFO;
            case 16:
                return BLOCK_PACKAGES;
            case 17:
                return UNBLOCK_PACKAGES;
            case 18:
                return CLEAR_CORPUS_DATA;
            case 19:
                return GET_APP_INDEXING_SERVICE;
            case 20:
                return GET_CLIENT_SERVICE_INTERFACE;
            case 21:
                return CHECK_CLIENT_RESOURCES;
            case 22:
                return SCHEDULE_INDEXING;
            case 23:
                return HANDLE_GCM_MESSAGE;
            case 24:
                return INIT_INDEX_MANAGER;
            case 25:
                return DESTROY_INDEX_MANAGER;
            case 26:
                return HANDLE_PACKAGE_MANAGER_BROADCAST;
            case 27:
                return HANDLE_DEVICE_STORAGE_OK;
            case 28:
                return HANDLE_GSERVICES_CHANGED;
            case 29:
                return COMMIT_INDEX;
            case 30:
                return FLUSH_INDEX;
            case 31:
                return REBUILD_INDEX;
            case 32:
                return COMPACT_INDEX;
            case 33:
                return COMPACT_AND_PURGE_INDEX;
            case 34:
                return INDEX_MAINTENANCE;
            case 35:
                return RETRY_FAILED_INDEXING_CORPORA;
            case 36:
                return UPDATE_NATIVE_CONFIG;
            case FelicaException.TYPE_NOT_CLOSED:
                return RESTORE_INDEX;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return READ_CLIENT_INFO_FROM_RESOURCES;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return REPARSE_GLOBAL_SEARCH_SECTION_MAPPINGS;
            case FelicaException.TYPE_PUSH_FAILED:
                return CLEAR_APP_DATA;
            case 41:
                return LOG_API_TRACE_EVENTS;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return CONTENT_FETCH;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return CLEAR_DEBUG_UI_CACHE;
            case FelicaException.TYPE_RESET_FAILED:
                return CLEAR_USAGE_REPORT_DATA;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return DIAGNOSTIC;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return GET_APP_INDEXING_PACKAGE_DETAILS;
            case 47:
                return GET_APP_INDEXING_PACKAGES;
            case 48:
                return GET_STORAGE_STATS;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return REQUEST_APP_INDEXING_UPDATE_INDEX;
            case 50:
                return CLEAR_CORPUS;
            case 51:
                return DELETE_USAGE_REPORT;
            case 52:
                return GET_CORPUS_INFO;
            case 53:
                return GET_CORPUS_STATUS;
            case 54:
                return ANNOTATE;
            case 55:
                return REQUEST_INDEXING;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return GET_CURRENT_EXPERIMENT_IDS;
            case 57:
                return GET_GLOBAL_SEARCH_SOURCES;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return GET_PENDING_EXPERIMENT_IDS;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return SET_EXPERIMENT_IDS;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return SET_INCLUDE_IN_GLOBAL_SEARCH;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return GET_CORPUS_HANDLES_REGISTERED_FOR_IME;
            case 62:
                return GET_IME_UPDATES;
            case 63:
                return GET_NATIVE_API_INFO;
            case 64:
                return GET_DOCUMENTS;
            case KeyInformation.AES128_DES56:
                return GET_PHRASE_AFFINITY;
            case 66:
                return GLOBAL_QUERY;
            case KeyInformation.AES128_DES112:
                return QUERY_SUGGEST;
            case 68:
                return QUERY;
            case 69:
                return BATCH_TASK;
            case 70:
                return APP_INDEXING_MUTATE;
            case 71:
                return APP_INDEXING_UPDATE;
            case 72:
                return APP_INDEXING_PATCH;
            case 73:
                return APP_INDEXING_REMOVE;
            case 74:
                return APP_INDEXING_REMOVE_ALL;
            case 75:
                return APP_INDEXING_REMOVE_TYPES;
            case 76:
                return APP_INDEXING_UPDATE_TAGS;
            case 77:
                return APP_INDEXING_GET;
            case 78:
                return APP_INDEXING_SEARCH;
            case KeyInformation.AES128:
                return LOG_QUERY_STATS;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return LOG_ANNOTATION_API_STATS;
            case 81:
                return APP_INDEXING_HANDLE_PACKAGE_REMOVAL;
            case 82:
                return RETRIEVE_SLICE;
            case 83:
                return APP_INDEXING_REPORT_USER_ACTION;
            case 84:
                return USER_ACTIONS_SYNC_DELETION_DOWNLOADS;
            case 85:
                return DRAIN_REQUEST_QUEUE;
            case 86:
                return USER_ACTIONS_PUSH_NOTIFICATIONS_HANDLE;
            case 87:
                return USER_ACTIONS_UPLOAD_ACCOUNT_CHANGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112501b() {
        return bqbc.f140211a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140302aL;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
