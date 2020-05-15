package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: aplq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aplq extends acpn {

    /* renamed from: n */
    protected final Object f84708n;

    /* renamed from: o */
    protected final abyy f84709o;

    protected aplq(bqbd bqbd, int i, int i2, Context context, Object obj, abyy abyy) {
        super(bqbd, i, 3, abyy.f58780f, acrz.m49787b(context));
        boolean z;
        int i3;
        boolean z2;
        this.f84708n = obj;
        this.f84709o = abyy;
        if (((aplp.f84707b ^ -1) & i2) == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "Invalid permissions: %d", Integer.valueOf(i2));
        if (!abyy.f58776b) {
            i3 = 1;
        } else {
            i3 = 15;
        }
        int i4 = ((abyy.f58777c ? i3 | 2 : i3) ^ -1) & i2;
        if (i4 != 0) {
            if (((aplp.f84707b ^ -1) & i4) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34976b(z2, "Permission bits out of range: %d", Integer.valueOf(i4));
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < aplp.f84706a.length; i5++) {
                if (((1 << i5) & i4) != 0) {
                    arrayList.add(aplp.f84706a[i5]);
                }
            }
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Access denied. Not authorized for: ");
            sb.append(valueOf);
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: b */
    private final void m70635b(Exception exc) {
        try {
            mo32358a(mo47405a(new Status(8, exc.getMessage())));
        } catch (RemoteException e) {
            absg.m48200c(e, "Task %s failed to deliver failure response for request %s", this, this.f84709o);
        }
        mo47406a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo47405a(Status status);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47406a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32358a(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo33000f() {
        return String.format("%s - client[%s]", mo32998d(), this.f84709o.f58780f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo32997a(RuntimeException runtimeException) {
        if (celu.f182917a.mo6606a().mo79288e()) {
            m70635b((Exception) runtimeException);
            return;
        }
        throw runtimeException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo32428b(Object obj) {
        try {
            mo32358a(obj);
            mo47406a((Exception) null);
        } catch (RemoteException e) {
            absg.m48195b(e, "Task %s failed to deliver result for request %s.", this, this.f84709o);
            if (!(e instanceof DeadObjectException)) {
                m70635b((Exception) e);
            }
        }
    }
}
