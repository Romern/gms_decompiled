package p000;

import android.content.Intent;
import android.util.SparseArray;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;

/* renamed from: adam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adam {

    /* renamed from: a */
    public final adal f61212a;

    /* renamed from: b */
    public final SparseArray f61213b = new SparseArray();

    /* renamed from: c */
    private final adan f61214c;

    private adam(adan adan, adal adal) {
        this.f61214c = adan;
        this.f61212a = adal;
    }

    /* renamed from: a */
    public static adam m50082a(FragmentActivity fragmentActivity) {
        adan a = adan.m50084a(fragmentActivity);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        adal adal = (adal) supportFragmentManager.findFragmentByTag("StartActivityForResultRetainedFragment");
        if (adal == null) {
            adal = new adal();
            adal.f61211a = new adam(a, adal);
            supportFragmentManager.beginTransaction().add(adal, "StartActivityForResultRetainedFragment").commitNow();
        } else if (adal.f61211a == null) {
            adal.f61211a = new adam(a, adal);
        }
        return adal.f61211a;
    }

    /* renamed from: a */
    public final adas mo33291a(int i, Intent intent) {
        return this.f61214c.mo33292a(Integer.valueOf(i), new adaj(this, i, intent));
    }
}
