package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: auqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auqg extends dck implements auqh {

    /* renamed from: a */
    private final aumc f92297a;

    /* renamed from: b */
    private final aurl f92298b;

    public auqg() {
        super("com.google.android.gms.trustagent.internal.IStateApi");
    }

    /* renamed from: a */
    public final void mo50794a(auqk auqk) {
        aups a = this.f92297a.mo50665a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("status", a.f92288a);
        bundle.putBoolean("configured", a.f92289b);
        bundle.putBoolean("in_trusted_state", a.f92290c);
        bundle.putLong("time_since_manual_unlock", a.f92291d);
        auqk.mo50796a(bundle);
    }

    /* renamed from: b */
    public final void mo50795b(auqk auqk) {
        boolean z;
        aurl aurl = this.f92298b;
        aurl.f92332a.mo50711a("getTrustletState", new Object[0]);
        rpr.m34216b();
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList(aurl.f92340i.size());
        Iterator it = aurl.f92340i.iterator();
        while (it.hasNext()) {
            auri auri = (auri) it.next();
            String str = auri.f92321d;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("key_trustlet_is_configured", auri.mo50822b());
            bundle2.putBoolean("key_trustlet_is_trusted", auri.mo50821a());
            try {
                if (auri.f92322e.mo50804d()) {
                    try {
                        if (auri.f92322e.mo50806f()) {
                            z = true;
                            bundle2.putBoolean("key_trustlet_is_supported", z);
                            bundle.putBundle(str, bundle2);
                            arrayList.add(str);
                        }
                    } catch (RemoteException e) {
                        auri.f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
                        z = false;
                    }
                }
                z = false;
            } catch (RemoteException e2) {
                auri.f92318a.mo50710a("RemoteException", e2, new Object[0]).mo50706a();
                z = false;
            }
            bundle2.putBoolean("key_trustlet_is_supported", z);
            bundle.putBundle(str, bundle2);
            arrayList.add(str);
        }
        bundle.putStringArrayList("key_trustlet_names", arrayList);
        auqk.mo50797b(bundle);
    }

    public auqg(aumc aumc, aurl aurl) {
        super("com.google.android.gms.trustagent.internal.IStateApi");
        this.f92297a = aumc;
        this.f92298b = aurl;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        auqk auqk = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.trustagent.internal.IStateCallbacks");
                if (queryLocalInterface instanceof auqk) {
                    auqk = (auqk) queryLocalInterface;
                } else {
                    auqk = new auqi(readStrongBinder);
                }
            }
            mo50794a(auqk);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.trustagent.internal.IStateCallbacks");
                if (queryLocalInterface2 instanceof auqk) {
                    auqk = (auqk) queryLocalInterface2;
                } else {
                    auqk = new auqi(readStrongBinder2);
                }
            }
            mo50795b(auqk);
        }
        parcel2.writeNoException();
        return true;
    }
}
