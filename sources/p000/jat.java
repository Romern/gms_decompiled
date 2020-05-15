package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.auth.folsom.p028ui.GenericChimeraActivity;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: jat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jat extends aaab {

    /* renamed from: a */
    private final jcm f22035a = ((jcm) jcm.f22159a.mo13145b());

    /* renamed from: b */
    private final jcf f22036b = ((jcf) jcf.f22150a.mo13145b());

    /* renamed from: c */
    private final jai f22037c;

    /* renamed from: d */
    private final String f22038d;

    /* renamed from: e */
    private final String f22039e;

    public jat(jai jai, String str, String str2) {
        super(172, "GetKeyMaterial");
        this.f22037c = jai;
        sdo.m34977c(str2);
        this.f22038d = str2;
        sdo.m34977c(str);
        this.f22039e = str;
    }

    /* renamed from: a */
    private final Status m16435a() {
        return new Status(38500, "No shared keys available", PendingIntent.getActivity(rpr.m34216b(), 0, GenericChimeraActivity.m6630a(this.f22038d, this.f22039e), 1207959552));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        List list;
        try {
            if (!this.f22036b.mo13575b(this.f22038d, this.f22039e)) {
                list = this.f22036b.mo13577c(this.f22038d, this.f22039e);
            } else {
                list = Collections.emptyList();
            }
            if (list.isEmpty()) {
                jcn jcn = new jcn();
                jcn.f22164a = new Account(this.f22038d, "com.google");
                jcn.mo13586a(this.f22039e);
                jcn.f22165b = jco.KEY_RETRIEVAL;
                this.f22035a.mo13582a(jcn.mo13585a());
                list = this.f22036b.mo13577c(this.f22038d, this.f22039e);
                if (list.isEmpty()) {
                    this.f22037c.mo13556a(m16435a(), new SharedKey[0]);
                    return;
                }
            }
            if (list.size() == 1) {
                if (((jbg) list.get(0)).f22092a == 0) {
                    this.f22037c.mo13556a(m16435a(), new SharedKey[0]);
                    return;
                }
            }
            jai jai = this.f22037c;
            Status status = Status.f30107a;
            SharedKey[] sharedKeyArr = new SharedKey[list.size()];
            for (int i = 0; i < list.size(); i++) {
                sharedKeyArr[i] = new SharedKey(((jbg) list.get(i)).f22092a, ((jbg) list.get(i)).f22093b.getKey());
            }
            jai.mo13556a(status, sharedKeyArr);
        } catch (jck e) {
            int i2 = e.f22158a;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 7) {
                this.f22037c.mo13556a(new Status(7, "Sync failed."), new SharedKey[0]);
            } else if (i3 == 8 || i3 == 9 || i3 == 11) {
                this.f22037c.mo13556a(m16435a(), new SharedKey[0]);
            } else {
                this.f22037c.mo13556a(new Status(8, "Sync failed."), new SharedKey[0]);
            }
        } catch (gid | IOException e2) {
            this.f22037c.mo13556a(new Status(8), new SharedKey[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22037c.mo13556a(status, new SharedKey[0]);
    }
}
