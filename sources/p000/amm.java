package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* renamed from: amm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amm implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final Messenger f909a;

    /* renamed from: b */
    public final amp f910b;

    /* renamed from: c */
    public int f911c = 1;

    /* renamed from: d */
    public int f912d = 1;

    /* renamed from: e */
    public int f913e;

    /* renamed from: f */
    public int f914f;

    /* renamed from: g */
    public final SparseArray f915g = new SparseArray();

    /* renamed from: h */
    final /* synthetic */ amt f916h;

    /* renamed from: i */
    private final Messenger f917i;

    public amm(amt amt, Messenger messenger) {
        this.f916h = amt;
        this.f909a = messenger;
        this.f910b = new amp(this);
        this.f917i = new Messenger(this.f910b);
    }

    /* renamed from: a */
    public final void mo1035a(int i) {
        int i2 = this.f911c;
        this.f911c = i2 + 1;
        mo1038a(4, i2, i, null, null);
    }

    /* renamed from: b */
    public final void mo1040b(int i) {
        int i2 = this.f911c;
        this.f911c = i2 + 1;
        mo1038a(5, i2, i, null, null);
    }

    public final void binderDied() {
        this.f916h.f938j.post(new aml(this));
    }

    /* renamed from: c */
    public final void mo1043c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.f911c;
        this.f911c = i3 + 1;
        mo1038a(8, i3, i, null, bundle);
    }

    /* renamed from: a */
    public final void mo1036a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", i2);
        int i3 = this.f911c;
        this.f911c = i3 + 1;
        mo1038a(6, i3, i, null, bundle);
    }

    /* renamed from: b */
    public final void mo1041b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.f911c;
        this.f911c = i3 + 1;
        mo1038a(7, i3, i, null, bundle);
    }

    /* renamed from: a */
    public final void mo1037a(akp akp) {
        int i = this.f911c;
        this.f911c = i + 1;
        mo1038a(10, i, 0, akp != null ? akp.f782a : null, null);
    }

    /* renamed from: a */
    public final boolean mo1038a(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.f917i;
        try {
            this.f909a.send(obtain);
            return true;
        } catch (DeadObjectException e) {
            return false;
        } catch (RemoteException e2) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo1039a(int i, Intent intent, alo alo) {
        int i2 = this.f911c;
        this.f911c = i2 + 1;
        if (!mo1038a(9, i2, i, intent, null)) {
            return false;
        }
        if (alo == null) {
            return true;
        }
        this.f915g.put(i2, alo);
        return true;
    }
}
