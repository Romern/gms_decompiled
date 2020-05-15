package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: cyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cyi extends cvq {

    /* renamed from: a */
    private static final Set f12393a = Collections.unmodifiableSet(new HashSet(Arrays.asList(204, Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR), Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR), 202, 40812, 40817, 130, 148, 40817, 40812, 57136, 57137, 57138, 57139, 57140, Integer.valueOf((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD), Integer.valueOf((int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR), Integer.valueOf((int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT), Integer.valueOf((int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE), Integer.valueOf((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED), Integer.valueOf((int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE), Integer.valueOf((int) BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR), Integer.valueOf((int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR), 57152, 57155, 57156, 57153, 57154, 203, Integer.valueOf((int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR), 205)));

    /* renamed from: b */
    private static final List f12394b = Collections.unmodifiableList(Arrays.asList(new cyl(), new cye(), new cyf(), new cyd(), new cyj(), new cyg("9F36"), new cyk(), new cyh("DC")));

    public cyi() {
        super(cuo.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (p000.cyi.f12393a.contains(java.lang.Integer.valueOf(p000.cvz.m7718b(r7.mo8298a(), r7.mo8299b()))) != false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0042  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cvv mo8339a(cuf cuf, cvs cvs) {
        cuo cuo = (cuo) cuf;
        cyp cyp = (cyp) cvs;
        boolean z = true;
        if (!cyp.mo8402c().mo8362a(cwj.GET_DATA_AFTER_GPO)) {
        }
        cyq.m7910a(cvs);
        Iterator it = f12394b.iterator();
        cut cut = null;
        while (it.hasNext() && (cut = ((cyn) it.next()).mo8390a(cuo, cyp)) == null) {
            while (it.hasNext()) {
                while (it.hasNext()) {
                }
            }
        }
        if (cut != null) {
            z = false;
        }
        cuu.REFERENCED_DATA_NOT_FOUND.mo8315a(z);
        return cvv.m7696a(cut);
    }
}
