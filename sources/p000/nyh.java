package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseLongArray;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Random;

/* renamed from: nyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyh {

    /* renamed from: a */
    public static final bnsn f36925a = odk.m28481a("CAR.BT");

    /* renamed from: b */
    static final SparseLongArray f36926b;

    /* renamed from: c */
    static final nyg f36927c = new nyg(-1);

    /* renamed from: d */
    static final nyg f36928d = new nyg(-2);

    /* renamed from: e */
    public static final Object f36929e = new Object();

    /* renamed from: f */
    public static final Object f36930f = new Object();

    /* renamed from: g */
    public static final Object f36931g = new Object();

    /* renamed from: h */
    public static final Object f36932h = new Object();

    /* renamed from: i */
    public final Handler f36933i;

    /* renamed from: j */
    final SparseArray f36934j = new SparseArray(13);

    /* renamed from: k */
    public int f36935k = 0;

    /* renamed from: l */
    public nyg f36936l;

    /* renamed from: m */
    public nyj f36937m;

    /* renamed from: n */
    public boolean f36938n = false;

    /* renamed from: o */
    public boolean f36939o = false;

    /* renamed from: p */
    public boolean f36940p = false;

    /* renamed from: q */
    public int f36941q;

    /* renamed from: r */
    public int f36942r;

    /* renamed from: s */
    private final nyr f36943s;

    /* renamed from: t */
    private final nyd f36944t;

    /* renamed from: u */
    private final olt f36945u;

    /* renamed from: v */
    private final Random f36946v;

    /* renamed from: w */
    private final boolean f36947w;

    /* renamed from: x */
    private int f36948x = -1;

    static {
        SparseLongArray sparseLongArray = new SparseLongArray(13);
        f36926b = sparseLongArray;
        sparseLongArray.put(0, 0);
        f36926b.put(1, 5000);
        f36926b.put(2, 4000);
        f36926b.put(3, 4000);
        f36926b.put(4, 120000);
        f36926b.put(5, 60000);
        f36926b.put(6, 10000);
        f36926b.put(7, 10000);
        f36926b.put(8, 60000);
        f36926b.put(9, 3000);
        f36926b.put(10, 10000);
        f36926b.put(11, 0);
        f36926b.put(12, 0);
        f36926b.put(100, 0);
    }

    public nyh(Looper looper, nyr nyr, nyd nyd, olt olt) {
        Random random = new Random();
        this.f36933i = new nvt(this, looper);
        this.f36943s = nyr;
        this.f36944t = nyd;
        this.f36945u = olt;
        this.f36946v = random;
        this.f36947w = ccpm.m131132e() > 0 || ccpm.m131131d() > 0;
        SparseArray sparseArray = new SparseArray(17);
        sparseArray.put(0, new nyg(100));
        sparseArray.put(1, new nyg(100));
        sparseArray.put(2, f36928d);
        sparseArray.put(100, new nyg(100));
        sparseArray.put(101, new nyg(1));
        sparseArray.put(102, f36928d);
        sparseArray.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray.put(202, f36928d);
        sparseArray.put(300, f36927c);
        sparseArray.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray.put(400, f36927c);
        sparseArray.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(0, sparseArray);
        SparseArray sparseArray2 = new SparseArray(17);
        sparseArray2.put(0, new nyg(100));
        sparseArray2.put(1, f36928d);
        sparseArray2.put(2, new nyg(1));
        sparseArray2.put(100, f36928d);
        sparseArray2.put(101, f36928d);
        sparseArray2.put(102, new nyg(2));
        sparseArray2.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray2.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray2.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray2.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray2.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray2.put(202, f36928d);
        sparseArray2.put(300, f36927c);
        sparseArray2.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray2.put(400, f36927c);
        sparseArray2.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray2.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(1, sparseArray2);
        SparseArray sparseArray3 = new SparseArray(17);
        sparseArray3.put(0, new nyg(100));
        sparseArray3.put(1, f36928d);
        sparseArray3.put(2, new nyg(2));
        sparseArray3.put(100, f36928d);
        sparseArray3.put(101, f36928d);
        sparseArray3.put(102, f36928d);
        sparseArray3.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, new nyg(2, 10000));
        sparseArray3.put(ErrorInfo.TYPE_SDU_FAILED, new nyg(3));
        sparseArray3.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray3.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray3.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray3.put(202, f36928d);
        sparseArray3.put(300, f36927c);
        sparseArray3.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray3.put(400, new nyg(2, 10000));
        sparseArray3.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray3.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(2, sparseArray3);
        SparseArray sparseArray4 = new SparseArray(17);
        sparseArray4.put(0, new nyg(100));
        sparseArray4.put(1, f36928d);
        sparseArray4.put(2, new nyg(3, 3, 2, 0));
        sparseArray4.put(100, f36928d);
        sparseArray4.put(101, f36928d);
        sparseArray4.put(102, f36928d);
        sparseArray4.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray4.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray4.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, new nyg(4));
        sparseArray4.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray4.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray4.put(202, f36928d);
        sparseArray4.put(300, f36927c);
        sparseArray4.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray4.put(400, new nyg(2));
        sparseArray4.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray4.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(3, sparseArray4);
        SparseArray sparseArray5 = new SparseArray(17);
        sparseArray5.put(0, new nyg(100));
        sparseArray5.put(1, f36928d);
        sparseArray5.put(2, new nyg(4));
        sparseArray5.put(100, f36928d);
        sparseArray5.put(101, f36928d);
        sparseArray5.put(102, f36928d);
        sparseArray5.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray5.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray5.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray5.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, new nyg(4, 1000));
        sparseArray5.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, new nyg(4, 120000));
        sparseArray5.put(202, new nyg(5));
        sparseArray5.put(300, f36927c);
        sparseArray5.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray5.put(400, new nyg(2));
        sparseArray5.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray5.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(4, sparseArray5);
        SparseArray sparseArray6 = new SparseArray(17);
        sparseArray6.put(0, new nyg(100));
        sparseArray6.put(1, f36928d);
        sparseArray6.put(2, new nyg(5, 2, 11, 0));
        sparseArray6.put(100, f36928d);
        sparseArray6.put(101, f36928d);
        sparseArray6.put(102, f36928d);
        sparseArray6.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray6.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray6.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray6.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray6.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray6.put(202, f36928d);
        sparseArray6.put(300, f36927c);
        sparseArray6.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, new nyg(9));
        sparseArray6.put(400, new nyg(2));
        sparseArray6.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray6.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, new nyg(6));
        this.f36934j.put(5, sparseArray6);
        SparseArray sparseArray7 = new SparseArray(17);
        sparseArray7.put(0, new nyg(100));
        sparseArray7.put(1, f36928d);
        sparseArray7.put(2, new nyg(11));
        sparseArray7.put(100, f36928d);
        sparseArray7.put(101, f36928d);
        sparseArray7.put(102, f36928d);
        sparseArray7.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray7.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray7.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray7.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray7.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray7.put(202, f36928d);
        sparseArray7.put(300, new nyg(8));
        sparseArray7.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, new nyg(9));
        sparseArray7.put(400, new nyg(2));
        sparseArray7.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, new nyg(7));
        sparseArray7.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(6, sparseArray7);
        SparseArray sparseArray8 = new SparseArray(17);
        int i = !this.f36947w ? 11 : 12;
        sparseArray8.put(0, new nyg(100));
        sparseArray8.put(1, f36928d);
        sparseArray8.put(2, new nyg(i));
        sparseArray8.put(100, f36928d);
        sparseArray8.put(101, f36928d);
        sparseArray8.put(102, f36928d);
        sparseArray8.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray8.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray8.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray8.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray8.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray8.put(202, f36928d);
        sparseArray8.put(300, new nyg(8));
        sparseArray8.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, new nyg(9));
        sparseArray8.put(400, new nyg(2));
        sparseArray8.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, new nyg(i));
        sparseArray8.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(7, sparseArray8);
        if (this.f36947w) {
            SparseArray sparseArray9 = new SparseArray(17);
            sparseArray9.put(0, new nyg(100));
            sparseArray9.put(1, f36928d);
            sparseArray9.put(2, new nyg(11));
            sparseArray9.put(100, f36928d);
            sparseArray9.put(101, f36928d);
            sparseArray9.put(102, f36928d);
            sparseArray9.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
            sparseArray9.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
            sparseArray9.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
            sparseArray9.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
            sparseArray9.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
            sparseArray9.put(202, f36928d);
            sparseArray9.put(300, new nyg(8));
            sparseArray9.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, new nyg(9));
            sparseArray9.put(400, new nyg(2));
            sparseArray9.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
            sparseArray9.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
            this.f36934j.put(12, sparseArray9);
        }
        SparseArray sparseArray10 = new SparseArray(17);
        sparseArray10.put(0, new nyg(100));
        sparseArray10.put(1, f36928d);
        sparseArray10.put(2, new nyg(8, 2, 11, 0));
        sparseArray10.put(100, f36928d);
        sparseArray10.put(101, f36928d);
        sparseArray10.put(102, f36928d);
        sparseArray10.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray10.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray10.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray10.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray10.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray10.put(202, f36928d);
        sparseArray10.put(300, f36927c);
        sparseArray10.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, new nyg(9));
        sparseArray10.put(400, new nyg(2));
        sparseArray10.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, new nyg(4));
        sparseArray10.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, new nyg(8, 3, 4, 4000));
        this.f36934j.put(8, sparseArray10);
        SparseArray sparseArray11 = new SparseArray(17);
        sparseArray11.put(0, new nyg(100));
        sparseArray11.put(1, f36928d);
        sparseArray11.put(2, new nyg(10));
        sparseArray11.put(100, f36928d);
        sparseArray11.put(101, f36928d);
        sparseArray11.put(102, f36928d);
        sparseArray11.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray11.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray11.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray11.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray11.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray11.put(202, f36928d);
        sparseArray11.put(300, f36927c);
        sparseArray11.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray11.put(400, new nyg(2));
        sparseArray11.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, new nyg(4));
        sparseArray11.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, new nyg(5, 1000));
        this.f36934j.put(9, sparseArray11);
        SparseArray sparseArray12 = new SparseArray(17);
        sparseArray12.put(0, new nyg(100));
        sparseArray12.put(1, f36928d);
        sparseArray12.put(2, new nyg(10));
        sparseArray12.put(100, f36928d);
        sparseArray12.put(101, f36928d);
        sparseArray12.put(102, f36928d);
        sparseArray12.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray12.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray12.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray12.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray12.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray12.put(202, f36928d);
        sparseArray12.put(300, f36927c);
        sparseArray12.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray12.put(400, new nyg(2));
        sparseArray12.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, new nyg(4));
        sparseArray12.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, new nyg(5, 1000));
        this.f36934j.put(10, sparseArray12);
        SparseArray sparseArray13 = new SparseArray(17);
        sparseArray13.put(0, new nyg(100));
        sparseArray13.put(1, f36928d);
        sparseArray13.put(2, new nyg(11, 2, 4, 0));
        sparseArray13.put(100, f36928d);
        sparseArray13.put(101, f36928d);
        sparseArray13.put(102, f36928d);
        sparseArray13.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36928d);
        sparseArray13.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray13.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray13.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36928d);
        sparseArray13.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36928d);
        sparseArray13.put(202, f36928d);
        sparseArray13.put(300, new nyg(11, 2, 4, 0));
        sparseArray13.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, new nyg(9));
        sparseArray13.put(400, new nyg(2));
        sparseArray13.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, new nyg(4));
        sparseArray13.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(11, sparseArray13);
        SparseArray sparseArray14 = new SparseArray(17);
        sparseArray14.put(0, f36927c);
        sparseArray14.put(1, f36927c);
        sparseArray14.put(2, f36928d);
        sparseArray14.put(100, f36927c);
        sparseArray14.put(101, f36927c);
        sparseArray14.put(102, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_SDU_FAILED, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, f36927c);
        sparseArray14.put(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, f36927c);
        sparseArray14.put(202, f36927c);
        sparseArray14.put(300, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_FSC_HTTP_ERROR, f36927c);
        sparseArray14.put(400, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, f36927c);
        sparseArray14.put(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, f36927c);
        this.f36934j.put(100, sparseArray14);
    }

    /* renamed from: a */
    static String m28164a(int i) {
        if (i == 0) {
            return "EVENT_UNKNOWN_ERROR";
        }
        if (i == 1) {
            return "EVENT_SKIP_REQUESTED";
        }
        if (i == 2) {
            return "EVENT_STATE_TIMEOUT";
        }
        if (i == 300) {
            return "EVENT_PAIRED";
        }
        if (i == 301) {
            return "EVENT_HFP_CONNECTED";
        }
        switch (i) {
            case 100:
                return "EVENT_SERVICE_INITIALIZATION_FAILED";
            case 101:
                return "EVENT_SERVICE_INITIALIZED";
            case 102:
                return "EVENT_ENDPOINT_READY";
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return "EVENT_ENABLING_FAILED";
            case ErrorInfo.TYPE_SDU_FAILED:
                return "EVENT_ENABLED";
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return "EVENT_BLUETOOTH_PROFILE_UTIL_READY";
            default:
                switch (i) {
                    case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                        return "EVENT_CAR_CANNOT_BE_PAIRED";
                    case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        return "EVENT_CAR_DELAYING_PAIRING";
                    case 202:
                        return "EVENT_CAR_READY_FOR_PAIRING";
                    default:
                        switch (i) {
                            case 400:
                                return "EVENT_DISABLED";
                            case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                return "EVENT_UNPAIRED";
                            case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                return "EVENT_HFP_DISCONNECTED";
                            default:
                                StringBuilder sb = new StringBuilder(29);
                                sb.append("WRONG-EVENT-CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
        }
    }

    /* renamed from: b */
    public static String m28165b(int i) {
        if (i == 100) {
            return "FAILED";
        }
        switch (i) {
            case 0:
                return "INITIAL";
            case 1:
                return "WAITING_FOR_ENDPOINT_READY";
            case 2:
                return "ENABLING";
            case 3:
                return "WAITING_FOR_BLUETOOTH_PROFILE_UTIL";
            case 4:
                return "REQUESTING_CAR_PAIRING_PREPARATION";
            case 5:
                return "HFP_CONNECTION_CHECKING";
            case 6:
                return "PREPARING_FOR_PAIRING";
            case 7:
                return "PAIRING";
            case 8:
                return "HFP_CONNECTING";
            case 9:
                return "HFP_CONNECTED";
            case 10:
                return "HFP_MONITORING";
            case 11:
                return "UNPAIRING";
            case 12:
                return "PAIRING_FAILURE_BACKOFF";
            default:
                StringBuilder sb = new StringBuilder(29);
                sb.append("WRONG-STATE-CODE(");
                sb.append(i);
                sb.append(")");
                return sb.toString();
        }
    }

    /* renamed from: c */
    public final void mo21836c(int i) {
        long j;
        int i2;
        m28165b(this.f36935k);
        m28164a(i);
        this.f36948x = i;
        if (this.f36940p) {
            bnsi d = f36925a.mo68390d();
            d.mo68432a("nyh", "c", 799, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68424a("event fired after cleanup. currentState=%s event%s", m28165b(this.f36935k), m28164a(i));
            return;
        }
        SparseArray sparseArray = (SparseArray) this.f36934j.get(this.f36935k);
        if (sparseArray == null) {
            bnsi d2 = f36925a.mo68390d();
            d2.mo68432a("nyh", "c", 807, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("No transition map defined for state %s", m28165b(this.f36935k));
            return;
        }
        nyg nyg = (nyg) sparseArray.get(i);
        if (nyg == null) {
            bnsi d3 = f36925a.mo68390d();
            d3.mo68432a("nyh", "c", 813, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68424a("No transition defined. state=%s event=%s", m28165b(this.f36935k), m28164a(i));
        } else if (nyg == f36927c) {
        } else {
            if (nyg == f36928d) {
                bnsi b = f36925a.mo68387b();
                b.mo68432a("nyh", "c", 822, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68424a("Wrong transition. state=%s event=%s", m28165b(this.f36935k), m28164a(i));
                return;
            }
            nyg nyg2 = this.f36936l;
            if (nyg != nyg2) {
                if (nyg2 != null) {
                    nyg2.f36924f = 0;
                }
                this.f36936l = nyg;
            }
            nyg.f36924f++;
            nyg.toString();
            this.f36933i.removeCallbacksAndMessages(f36929e);
            int i3 = nyg.f36921c;
            if (i3 != 0 && nyg.f36924f > i3) {
                i2 = nyg.f36922d;
                j = (long) nyg.f36923e;
                if (this.f36935k == 8 && i == 402) {
                    this.f36939o = true;
                }
            } else {
                i2 = nyg.f36919a;
                j = nyg.f36920b;
            }
            if (j != 0) {
                this.f36933i.postAtTime(new nye(this, i2), f36929e, SystemClock.uptimeMillis() + j);
            } else {
                mo21838e(i2);
            }
        }
    }

    /* renamed from: d */
    public final void mo21837d(int i) {
        m28165b(this.f36935k);
        m28165b(i);
        nyg nyg = this.f36936l;
        if (nyg != null) {
            nyg.f36924f = 0;
            this.f36936l = null;
        }
        this.f36933i.removeCallbacksAndMessages(f36929e);
        mo21838e(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo21838e(int i) {
        long j;
        m28165b(i);
        this.f36933i.removeCallbacksAndMessages(f36930f);
        this.f36935k = i;
        int i2 = 12;
        if (i == 12) {
            j = ccpm.m131132e() + ((long) this.f36946v.nextInt(((int) ccpm.m131131d()) + 1));
        } else {
            j = f36926b.get(i, -1);
        }
        if (j == -1) {
            m28165b(this.f36935k);
        } else if (j > 0) {
            m28165b(this.f36935k);
            this.f36933i.postAtTime(new nyf(this), f36930f, SystemClock.uptimeMillis() + j);
        }
        int i3 = this.f36935k;
        if (i3 != 100) {
            switch (i3) {
                case 0:
                case 1:
                    return;
                case 2:
                    if (this.f36943s.mo21857a()) {
                        mo21837d(3);
                        return;
                    }
                    this.f36937m = null;
                    nyr nyr = this.f36943s;
                    if (nyr.f36977n == 0) {
                        bmxy.m108581a(nyr.f36966c);
                        if (nyr.f36966c.mo21820b()) {
                            return;
                        }
                    }
                    mo21836c(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                    return;
                case 3:
                    this.f36944t.mo20960a();
                    return;
                case 4:
                    this.f36938n = false;
                    if (this.f36943s.mo21860b()) {
                        mo21837d(11);
                        return;
                    } else {
                        this.f36944t.mo20965b();
                        return;
                    }
                case 5:
                    bmxy.m108581a(this.f36937m);
                    if (this.f36937m.mo21844b()) {
                        mo21837d(9);
                        return;
                    } else if (!this.f36937m.mo21843a()) {
                        m28166b();
                        mo21837d(6);
                        return;
                    } else if (!this.f36943s.mo21861c() || !this.f36938n) {
                        m28166b();
                        mo21837d(6);
                        return;
                    } else {
                        return;
                    }
                case 6:
                    if (this.f36943s.mo21860b()) {
                        if (ccpm.m131133f()) {
                            this.f36943s.mo21854a(3);
                            return;
                        } else {
                            this.f36943s.mo21864f();
                            return;
                        }
                    } else if (!this.f36943s.mo21861c()) {
                        mo21837d(7);
                        return;
                    } else if (this.f36938n) {
                        mo21837d(8);
                        return;
                    } else if (ccpm.m131133f()) {
                        this.f36943s.mo21854a(4);
                        return;
                    } else {
                        this.f36943s.mo21864f();
                        return;
                    }
                case 7:
                    nyr nyr2 = this.f36943s;
                    if (nyr2.f36977n == 0) {
                        bmxy.m108581a(nyr2.f36966c);
                        if (nyr2.f36966c.f36908a.isDiscovering()) {
                            nyr2.f36966c.mo21821c();
                        }
                        bmxy.m108581a(nyr2.f36968e);
                        if (nyr2.f36968e.f36910a.createBond()) {
                            return;
                        }
                    }
                    bnsi d = f36925a.mo68390d();
                    d.mo68432a("nyh", "e", 1008, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("pair failed");
                    if (!this.f36947w) {
                        i2 = 11;
                    }
                    mo21837d(i2);
                    return;
                case 8:
                    if (!this.f36943s.mo21861c()) {
                        mo21837d(4);
                        return;
                    }
                    this.f36938n = true;
                    bmxy.m108581a(this.f36937m);
                    if (this.f36937m.mo21844b()) {
                        mo21837d(9);
                        return;
                    } else if (!this.f36937m.mo21843a()) {
                        int i4 = ((nyg) ((SparseArray) this.f36934j.get(8)).get(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED)).f36924f;
                        if (!this.f36945u.mo21309an() || this.f36948x != 402 || i4 > 0) {
                            mo21835a();
                            return;
                        } else {
                            this.f36933i.postAtTime(new nya(this), f36932h, SystemClock.uptimeMillis() + 25000);
                            return;
                        }
                    } else {
                        return;
                    }
                case 9:
                    this.f36938n = true;
                    this.f36942r = 0;
                    this.f36944t.mo20966d();
                    return;
                case 10:
                    bmxy.m108581a(this.f36937m);
                    if (!this.f36937m.mo21844b()) {
                        mo21837d(5);
                        return;
                    }
                    return;
                case 11:
                    int i5 = this.f36941q + 1;
                    this.f36941q = i5;
                    int i6 = this.f36942r + 1;
                    this.f36942r = i6;
                    if (i6 > 2) {
                        double pow = Math.pow(2.0d, (double) Math.max(0, i6 - 3));
                        this.f36933i.postAtTime(new nyb(this, this.f36941q), f36931g, SystemClock.uptimeMillis() + ((long) (((int) pow) * 1000)));
                        return;
                    }
                    mo21839f(i5);
                    return;
                case 12:
                    return;
                default:
                    bnsi b = f36925a.mo68387b();
                    b.mo68432a("nyh", "e", 1111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68409a("handleTransition: Wrong state %d", this.f36935k);
                    return;
            }
        } else {
            bnsi b2 = f36925a.mo68387b();
            b2.mo68432a("nyh", "e", 1107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("Failed");
        }
    }

    /* renamed from: f */
    public final void mo21839f(int i) {
        if (!this.f36943s.mo21860b() && !this.f36943s.mo21861c()) {
            mo21837d(4);
        } else if (!ccpm.m131129b() || this.f36945u.mo21351u() != 2) {
            if (ccpm.m131133f()) {
                this.f36943s.mo21854a(1);
            } else {
                this.f36943s.mo21864f();
            }
            this.f36933i.postAtTime(new nyc(this, i), f36931g, SystemClock.uptimeMillis() + 6000);
        }
    }

    /* renamed from: b */
    private final void m28166b() {
        if (!ccpm.f179688a.mo6606a().mo76592h()) {
            bnsi d = f36925a.mo68390d();
            d.mo68432a("nyh", "b", 1118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Disconnecting all HFP");
            bmxy.m108581a(this.f36937m);
            this.f36937m.mo21845c();
        }
    }

    /* renamed from: a */
    public final void mo21835a() {
        bmxy.m108581a(this.f36937m);
        if (!this.f36937m.mo21846d()) {
            bnsi d = f36925a.mo68390d();
            d.mo68432a("nyh", "a", 1162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("connectHfp failed");
            mo21836c(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
        }
    }
}
