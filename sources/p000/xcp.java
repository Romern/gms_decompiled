package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: xcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcp extends aaab {

    /* renamed from: e */
    private static final Logger f51946e = new Logger(new String[]{"DeleteKeyOperation"}, (short[]) null);

    /* renamed from: a */
    private final xcm f51947a = ((xcm) xcm.f51937d.mo33309a());

    /* renamed from: b */
    private final rnt f51948b;

    /* renamed from: c */
    private final String f51949c;

    /* renamed from: d */
    private final byte[] f51950d;

    public xcp(rnt rnt, String str, byte[] bArr) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "DeleteKey");
        this.f51948b = rnt;
        this.f51949c = str;
        this.f51950d = bArr;
        new xde(rpr.m34216b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            String str = this.f51949c;
            byte[] bArr = this.f51950d;
            sdo.m34969a(str, (Object) "rpId cannot be empty");
            sdo.checkIfNull(bArr, "keyHandle cannot be null");
            Logger Logger = f51946e;
            String arrays = Arrays.toString(this.f51950d);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(arrays).length());
            sb.append("deleteKey with rpId ");
            sb.append(str);
            sb.append(" with keyHandle ");
            sb.append(arrays);
            Logger.mo25412b(sb.toString(), new Object[0]);
            xcv xcv = new xcv(str, bArr);
            xmq xmq = xcv.f51972a;
            String a = xcv.mo29645a();
            if (xmq == xmq.KEYSTORE || xmq == xmq.STRONGBOX) {
                xde.m42693a(a);
            }
            this.f51947a.mo29633a(a);
            this.f51948b.mo11797a(Status.f30107a);
        } catch (adbe e) {
            this.f51948b.mo11797a(e.mo33302b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f51948b.mo11797a(status);
    }
}
