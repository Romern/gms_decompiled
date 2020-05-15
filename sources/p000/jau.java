package p000;

import android.accounts.Account;
import android.content.Context;
import android.security.keystore.recovery.RecoveryController;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;

/* renamed from: jau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jau extends aaab {

    /* renamed from: a */
    private final jaf f22040a;

    /* renamed from: b */
    private final String f22041b;

    /* renamed from: c */
    private final String f22042c;

    /* renamed from: d */
    private final jcf f22043d = ((jcf) jcf.f22150a.mo13145b());

    /* renamed from: e */
    private final jcm f22044e = ((jcm) jcm.f22159a.mo13145b());

    public jau(jaf jaf, String str, String str2) {
        super(172, "GetSyncStatus");
        this.f22040a = jaf;
        sdo.m34977c(str);
        this.f22041b = str;
        sdo.m34977c(str2);
        this.f22042c = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (jde.f22216b) {
            try {
                if (!RecoveryController.isRecoverableKeyStoreEnabled(context)) {
                    this.f22040a.mo13555a(Status.f30107a, 2);
                    return;
                }
                this.f22044e.mo13581a();
                if (this.f22043d.mo13573a(this.f22042c, this.f22041b)) {
                    jcn jcn = new jcn();
                    jcn.f22164a = new Account(this.f22042c, "com.google");
                    jcn.mo13586a(this.f22041b);
                    jcn.f22165b = jco.GET_STATUS;
                    jcp a = jcn.mo13585a();
                    jcm jcm = this.f22044e;
                    jcm.f22160b.mo25414c("Checking if synced for event: %s", a.f22182c.f22178j);
                    try {
                        String str = a.f22180a.name;
                        bmxv bmxv = a.f22181b;
                        if (bmxv.mo66813a() && !jcm.f22161c.mo13575b(str, (String) bmxv.mo66814b())) {
                            List c = jcm.f22161c.mo13577c(str, (String) bmxv.mo66814b());
                            if (!c.isEmpty() && ((jbg) bnjd.m109595d(c)).f22092a != 0) {
                                this.f22040a.mo13555a(Status.f30107a, 7);
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        jcm.f22160b.mo25411b("Exception in checking if synced.", e, new Object[0]);
                        this.f22040a.mo13555a(Status.f30107a, 6);
                        return;
                    } catch (gid e2) {
                        e = e2;
                        jcm.f22160b.mo25411b("Exception in checking if synced.", e, new Object[0]);
                        this.f22040a.mo13555a(Status.f30107a, 6);
                        return;
                    }
                    this.f22040a.mo13555a(Status.f30107a, 6);
                    return;
                }
                this.f22040a.mo13555a(Status.f30107a, 5);
            } catch (jck e3) {
                int i = e3.f22158a;
                if (i == 0) {
                    throw null;
                } else if (i == 7) {
                    this.f22040a.mo13555a(Status.f30107a, 4);
                } else if (i != 10) {
                    this.f22040a.mo13555a(Status.f30109c, 0);
                } else {
                    this.f22040a.mo13555a(Status.f30107a, 3);
                }
            } catch (gid | IOException e4) {
                this.f22040a.mo13555a(Status.f30109c, 0);
            }
        } else {
            this.f22040a.mo13555a(Status.f30107a, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22040a.mo13555a(status, 0);
    }
}
