package p000;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pmk extends qal {

    /* renamed from: a */
    final List f39701a = new ArrayList();

    /* renamed from: b */
    boolean f39702b = false;

    /* renamed from: h */
    private final String f39703h;

    public pmk(Context context, Handler handler, ScheduledExecutorService scheduledExecutorService, String str) {
        super(context, "FilterRequest", pmn.f39709c, handler, scheduledExecutorService);
        this.f39703h = str;
    }

    /* renamed from: a */
    private static final void m30827a(String str) {
        synchronized (pmn.f39710e) {
            pmn.f39710e.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23417b() {
        if (this.f39702b) {
            pmn.f39708a.mo23675c("Filter already executed once.", new Object[0]);
            return;
        }
        if (pmn.f39711f) {
            super.start();
        }
        this.f39702b = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo23073a() {
        if (TextUtils.isEmpty(this.f39703h)) {
            this.f40798d.mo23675c("Filtering app id is null or empty.", new Object[0]);
            return null;
        }
        bxvd da = blue.f127791c.mo74144da();
        String str = this.f39703h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blue blue = (blue) da.f164949b;
        str.getClass();
        blue.f127793a |= 2;
        blue.f127794b = str;
        return da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo23074a(int i) {
        this.f40798d.mo23857a("onError: %s %d", this.f39703h, Integer.valueOf(i));
        List list = this.f39701a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pml) list.get(i2)).mo23418a();
        }
        m30827a(this.f39703h);
    }

    /* renamed from: a */
    public final synchronized void mo23416a(pml pml) {
        this.f39701a.add(pml);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo23075a(byte[] bArr) {
        String str;
        this.f40798d.mo23856a("onSuccessResponse: %s", this.f39703h);
        try {
            boolean z = ((bluf) GeneratedMessageLite.m124016a(bluf.f127795b, bArr, bxus.m123744c())).f127797a;
            this.f40798d.mo23857a("onSuccessResponse: %s %b", this.f39703h, Boolean.valueOf(z));
            for (pml pml : this.f39701a) {
                String str2 = this.f39703h;
                if (!pml.f39704a.f39705a.f39721n) {
                    if (!z) {
                        pml.f39704a.f39705a.f39716i.add(str2);
                    } else {
                        pml.f39704a.f39705a.f39715h.add(str2);
                    }
                }
                pml.f39704a.mo23419a();
            }
            str = this.f39703h;
        } catch (bxwf e) {
            try {
                this.f40798d.mo23676c(e, "Unable to parse response data", new Object[0]);
                for (pml pml2 : this.f39701a) {
                    pml2.mo23418a();
                }
                str = this.f39703h;
            } catch (Throwable th) {
                m30827a(this.f39703h);
                throw th;
            }
        }
        m30827a(str);
    }
}
