package p000;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: afcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afcn {

    /* renamed from: a */
    public final afei f64181a;

    /* renamed from: b */
    private afcw f64182b;

    public afcn(afei afei) {
        sdo.m34959a(afei);
        this.f64181a = afei;
    }

    /* renamed from: a */
    public final afhb mo34746a(GroundOverlayOptions groundOverlayOptions) {
        try {
            afia a = this.f64181a.mo34796a(groundOverlayOptions);
            if (a != null) {
                return new afhb(a);
            }
            return null;
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final Location mo34757c() {
        try {
            return this.f64181a.mo34810d();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: d */
    public final afcw mo34758d() {
        try {
            if (this.f64182b == null) {
                this.f64182b = new afcw(this.f64181a.mo34811e());
            }
            return this.f64182b;
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: e */
    public final afct mo34759e() {
        try {
            return new afct(this.f64181a.mo34812f());
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: b */
    public final void mo34755b() {
        try {
            this.f64181a.mo34809c();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: b */
    public final void mo34756b(afch afch) {
        try {
            this.f64181a.mo34808b(afch.f64178a);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final afhg mo34747a(MarkerOptions markerOptions) {
        try {
            afig a = this.f64181a.mo34797a(markerOptions);
            if (a != null) {
                return new afhg(a);
            }
            return null;
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final CameraPosition mo34748a() {
        try {
            return this.f64181a.mo34798a();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: a */
    public final void mo34749a(afch afch) {
        try {
            this.f64181a.mo34806a(afch.f64178a);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34750a(afck afck) {
        if (afck != null) {
            try {
                this.f64181a.mo34800a(new afeu(afck));
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } else {
            this.f64181a.mo34800a((afev) null);
        }
    }

    /* renamed from: a */
    public final void mo34751a(afcl afcl) {
        if (afcl != null) {
            try {
                this.f64181a.mo34803a(new affm(afcl));
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } else {
            this.f64181a.mo34803a((affn) null);
        }
    }

    /* renamed from: a */
    public final void mo34752a(afcm afcm) {
        if (afcm != null) {
            try {
                this.f64181a.mo34804a(new affu(afcm));
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } else {
            this.f64181a.mo34804a((affv) null);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34753a(bihg bihg) {
        if (bihg != null) {
            try {
                this.f64181a.mo34805a(new affz(bihg));
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } else {
            this.f64181a.mo34805a((afga) null);
        }
    }

    /* renamed from: a */
    public final void mo34754a(boolean z) {
        try {
            this.f64181a.mo34807a(z);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
