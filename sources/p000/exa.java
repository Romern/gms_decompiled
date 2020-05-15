package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: exa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class exa extends fbv {

    /* renamed from: a */
    public ffg f15962a;

    /* renamed from: b */
    public eym f15963b;

    /* renamed from: a */
    public static exa m11254a(bsxn bsxn, ffk ffk, String str) {
        exa exa = new exa();
        Bundle bundle = new Bundle();
        bundle.putByteArray("initialScreenKey", epr.m10927b(bsxn));
        if (ffr.m11620a(ffk)) {
            bundle.putString("initialAccountName", ffk.f16458a);
        }
        bundle.putString("callingAndroidApp", str);
        exa.setArguments(bundle);
        return exa;
    }

    public final void onCreate(Bundle bundle) {
        fen fen;
        int i;
        fen fen2;
        fek fek;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.f15963b == null) {
            epa a = eoz.m10886a(this.f16237l);
            cazf.m127594a(a);
            this.f15963b = new eym(a);
        }
        Context applicationContext = getActivity().getApplicationContext();
        esr a2 = esr.m11103a(getArguments().getString("callingAndroidApp"));
        if (bundle2 != null) {
            ero a3 = this.f15963b.mo10585a();
            eql d = this.f15963b.mo10588d();
            fhe b = this.f15963b.mo10586b();
            ffk a4 = ffr.m11619a(bundle2.getString("accountName"));
            bsxn a5 = epr.m10921a(bundle2.getByteArray("navStackHead"));
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("navStackTail");
            ArrayList arrayList = new ArrayList();
            int size = parcelableArrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                ArrayList arrayList2 = parcelableArrayList;
                bsxn a6 = epr.m10921a(bundle3.getByteArray("screenKey"));
                bsxn b2 = epr.m10925b(bundle3.getByteArray("topNavKey"));
                bsxn b3 = epr.m10925b(bundle3.getByteArray("bottomNavKey"));
                bsxn b4 = epr.m10925b(bundle3.getByteArray("bottomNavSelection"));
                Bundle bundle4 = (Bundle) bundle3.getParcelable("fragmentState");
                if (bundle4 != null) {
                    i = size;
                    fen2 = fen;
                    fek = new fek(bundle4.getString("className"), (Fragment.SavedState) bundle4.getParcelable("savedState"), bundle4.getBoolean("headerCollapsed"));
                } else {
                    i = size;
                    fen2 = fen;
                    fek = null;
                }
                arrayList.add(new fen(a6, b2, b3, b4, fek));
                i2++;
                parcelableArrayList = arrayList2;
                size = i;
            }
            this.f15962a = new ffg(applicationContext, a3, a4, a2, a5, arrayList, ffd.values()[bundle2.getInt("splashScreenUIState")], b, d);
            return;
        }
        bsxn a7 = epr.m10921a(getArguments().getByteArray("initialScreenKey"));
        this.f15962a = new ffg(applicationContext, this.f15963b.mo10585a(), ffr.m11619a(getArguments().getString("initialAccountName")), a2, a7, bngx.m109376e(), ffd.BRANDING, this.f15963b.mo10586b(), this.f15963b.mo10588d());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        ffg ffg = this.f15962a;
        if (ffr.m11620a(ffg.f16446a.mo10683b())) {
            bundle.putString("accountName", ffg.f16446a.mo10683b().f16458a);
        }
        bundle.putByteArray("navStackHead", epr.m10927b(ffg.f16448c.mo10756b()));
        bngx a = bngx.m109368a((Collection) ffg.f16448c.f16403c);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            fen fen = (fen) a.get(i);
            Bundle bundle3 = new Bundle();
            bundle3.putByteArray("screenKey", epr.m10927b(fen.f16396a));
            bundle3.putByteArray("topNavKey", epr.m10930c(fen.f16397b));
            bundle3.putByteArray("bottomNavKey", epr.m10930c(fen.f16398c));
            bundle3.putByteArray("bottomNavSelection", epr.m10930c(fen.f16399d));
            fek fek = fen.f16400e;
            if (fek != null) {
                bundle2 = new Bundle();
                bundle2.putString("className", fek.f16385a);
                bundle2.putParcelable("savedState", fek.f16386b);
                bundle2.putBoolean("headerCollapsed", fek.f16387c);
            } else {
                bundle2 = null;
            }
            bundle3.putParcelable("fragmentState", bundle2);
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList("navStackTail", arrayList);
        bundle.putInt("splashScreenUIState", ffg.f16451f.mo10769a().ordinal());
    }
}
