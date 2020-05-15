package com.google.android.gms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreatorImpl extends afee {

    /* renamed from: a */
    public afef f79863a = null;

    /* renamed from: b */
    private int f79864b = -1;

    /* renamed from: c */
    private Set f79865c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    private static Object m67164a(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        } catch (InstantiationException e2) {
            RemoteException remoteException2 = new RemoteException();
            remoteException2.initCause(e2);
            throw remoteException2;
        }
    }

    public void init(vzr vzr) {
        initV2(vzr, 0);
    }

    public void initV2(vzr vzr, int i) {
        this.f79864b = i;
    }

    public afhu newBitmapDescriptorFactoryDelegate() {
        return new afht(this);
    }

    public afeb newCameraUpdateFactoryDelegate() {
        return new afea(this);
    }

    public afep newMapFragmentDelegate(vzr vzr) {
        m67165a((Activity) vzs.m41641a(vzr));
        afef afef = this.f79863a;
        if (afef == null) {
            return new afeo((Context) vzs.m41641a(vzr));
        }
        return afef.newMapFragmentDelegate(vzr);
    }

    public afes newMapViewDelegate(vzr vzr, GoogleMapOptions googleMapOptions) {
        m67165a(((Context) vzs.m41641a(vzr)).getApplicationContext());
        afef afef = this.f79863a;
        if (afef == null) {
            return new afer((Context) vzs.m41641a(vzr));
        }
        return afef.newMapViewDelegate(vzr, googleMapOptions);
    }

    public afgm newStreetViewPanoramaFragmentDelegate(vzr vzr) {
        m67165a((Activity) vzs.m41641a(vzr));
        afef afef = this.f79863a;
        if (afef == null) {
            return new afgl((Context) vzs.m41641a(vzr));
        }
        return afef.newStreetViewPanoramaFragmentDelegate(vzr);
    }

    public afgp newStreetViewPanoramaViewDelegate(vzr vzr, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        m67165a(((Context) vzs.m41641a(vzr)).getApplicationContext());
        afef afef = this.f79863a;
        if (afef == null) {
            return new afgo((Context) vzs.m41641a(vzr));
        }
        return afef.newStreetViewPanoramaViewDelegate(vzr, streetViewPanoramaOptions);
    }

    /* renamed from: a */
    private final void m67165a(Context context) {
        if (this.f79863a == null) {
            try {
                Context a = qls.m32403a(context, "com.google.android.gms.maps_dynamite");
                if (a != null) {
                    ClassLoader classLoader = a.getClassLoader();
                    Resources resources = a.getResources();
                    afef asInterface = afee.asInterface((IBinder) m67164a(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
                    this.f79863a = asInterface;
                    asInterface.initV2(vzs.m41642a(resources), this.f79864b);
                    for (afdy afdy : this.f79865c) {
                        Object obj = afdy.f64219a;
                        if (obj instanceof afdx) {
                            afdy.f64219a = ((afdx) obj).mo34776a();
                        }
                    }
                    this.f79865c.clear();
                    return;
                }
                throw new RemoteException();
            } catch (ClassNotFoundException e) {
                RemoteException remoteException = new RemoteException();
                remoteException.initCause(e);
                throw remoteException;
            } catch (RemoteException e2) {
            }
        }
    }

    /* renamed from: a */
    public final vzr mo43852a(afdx afdx) {
        if (this.f79863a != null) {
            return vzs.m41642a(afdx.mo34776a());
        }
        afdy afdy = new afdy(afdx);
        this.f79865c.add(afdy);
        return afdy;
    }
}
