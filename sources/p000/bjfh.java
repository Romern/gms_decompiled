package p000;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Activity;
import java.util.ArrayList;

/* renamed from: bjfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfh extends bjil {

    /* renamed from: h */
    private static final String f122616h = bjfh.class.getName();

    /* renamed from: i */
    private static final adzt f122617i = new adzt(Looper.getMainLooper());

    /* renamed from: a */
    public final bjfg f122618a;

    /* renamed from: b */
    public final bjfa f122619b;

    /* renamed from: c */
    public final ArrayList f122620c;

    /* renamed from: d */
    public final ArrayList f122621d;

    /* renamed from: e */
    public final ArrayList f122622e;

    /* renamed from: f */
    public final ArrayList f122623f;

    /* renamed from: g */
    public boolean f122624g = false;

    private bjfh(bjfa bjfa, bjfg bjfg, Bundle bundle) {
        this.f122618a = bjfg;
        this.f122619b = bjfa;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle(f122616h);
            if (bundle2 != null) {
                this.f122621d = bundle2.getIntegerArrayList("requestCodes");
                this.f122622e = bundle2.getParcelableArrayList("requests");
                this.f122620c = bundle2.getIntegerArrayList("executionIds");
            } else {
                throw new IllegalStateException("State for ActionUiHelper was not properly saved, did you forget to call onSaveInstanceState?");
            }
        } else {
            this.f122621d = new ArrayList();
            this.f122622e = new ArrayList();
            this.f122620c = new ArrayList();
        }
        this.f122623f = new ArrayList();
        for (int size = this.f122621d.size(); size > 0; size--) {
            this.f122623f.add(null);
        }
    }

    /* renamed from: a */
    public static bjfh m103300a(Activity activity, bjfg bjfg, Bundle bundle) {
        bjfa a = bjfa.m103278a(activity);
        if (a != null) {
            return new bjfh(a, bjfg, bundle);
        }
        throw new IllegalStateException("Activity has no ActionExecutorFragment!");
    }

    /* renamed from: c */
    public final void mo65085c() {
        bjfa bjfa = this.f122619b;
        bjff bjff = new bjff(this);
        if (bjfa.f122606d) {
            bjff.run();
        } else {
            bjfa.f122604b.add(bjff);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public final void mo65086cG() {
        this.f122624g = false;
        f122617i.post(new bjfe(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: cb */
    public final void mo65087cb() {
        this.f122624g = true;
        int size = this.f122621d.size();
        for (int i = 0; i < size; i++) {
            bjez bjez = (bjez) this.f122623f.get(i);
            if (bjez != null) {
                bjez.f122600e = null;
            }
            this.f122623f.set(i, null);
        }
    }

    /* renamed from: a */
    public final void mo65084a(int i, bjfc bjfc) {
        if (!this.f122624g) {
            this.f122621d.add(Integer.valueOf(i));
            this.f122622e.add(bjfc.f122612a);
            this.f122620c.add(0);
            this.f122623f.add(null);
            mo65085c();
            return;
        }
        throw new IllegalStateException("Can't start an action due to potential state loss!");
    }

    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putIntegerArrayList("executionIds", this.f122620c);
        bundle2.putIntegerArrayList("requestCodes", this.f122621d);
        bundle2.putParcelableArrayList("requests", this.f122622e);
        bundle.putBundle(f122616h, bundle2);
    }
}
