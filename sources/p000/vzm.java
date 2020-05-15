package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: vzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzm {

    /* renamed from: a */
    public Bundle f50288a;

    /* renamed from: b */
    public LinkedList f50289b;

    /* renamed from: c */
    public afcq f50290c;

    /* renamed from: d */
    public final List f50291d;

    /* renamed from: e */
    protected vzh f50292e;

    /* renamed from: f */
    private final vzh f50293f;

    /* renamed from: g */
    private final ViewGroup f50294g;

    /* renamed from: h */
    private final Context f50295h;

    /* renamed from: i */
    private final GoogleMapOptions f50296i;

    public vzm() {
        this.f50293f = new vzh(this);
    }

    /* renamed from: a */
    public final void mo28998a(int i) {
        while (!this.f50289b.isEmpty() && ((vzl) this.f50289b.getLast()).mo28995a() >= i) {
            this.f50289b.removeLast();
        }
    }

    /* renamed from: a */
    public final void mo28999a(Bundle bundle, vzl vzl) {
        if (this.f50290c == null) {
            if (this.f50289b == null) {
                this.f50289b = new LinkedList();
            }
            this.f50289b.add(vzl);
            if (bundle != null) {
                Bundle bundle2 = this.f50288a;
                if (bundle2 == null) {
                    this.f50288a = (Bundle) bundle.clone();
                } else {
                    bundle2.putAll(bundle);
                }
            }
            vzh vzh = this.f50293f;
            this.f50292e = vzh;
            if (vzh != null && this.f50290c == null) {
                try {
                    afcr.m52860a(this.f50295h);
                    afes newMapViewDelegate = afgu.m53063a(this.f50295h).newMapViewDelegate(vzs.m41642a(this.f50295h), this.f50296i);
                    if (newMapViewDelegate != null) {
                        vzh vzh2 = this.f50292e;
                        afcq afcq = new afcq(this.f50294g, newMapViewDelegate);
                        vzm vzm = vzh2.f50282a;
                        vzm.f50290c = afcq;
                        Iterator it = vzm.f50289b.iterator();
                        while (it.hasNext()) {
                            ((vzl) it.next()).mo28996b();
                        }
                        vzh2.f50282a.f50289b.clear();
                        vzh2.f50282a.f50288a = null;
                        for (afcs afcs : this.f50291d) {
                            this.f50290c.mo34762a(afcs);
                        }
                        this.f50291d.clear();
                    }
                } catch (RemoteException e) {
                    throw new afhl(e);
                } catch (rfv e2) {
                }
            }
        } else {
            vzl.mo28996b();
        }
    }

    public vzm(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f50293f = new vzh(this);
        this.f50291d = new ArrayList();
        this.f50294g = viewGroup;
        this.f50295h = context;
        this.f50296i = googleMapOptions;
    }
}
