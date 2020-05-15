package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: akoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akoy extends Fragment {

    /* renamed from: a */
    private final akpj f72375a;

    public akoy(Activity activity, Bundle bundle, akpg akpg) {
        akpj akpj;
        try {
            waq a = waq.m41676a(activity, waq.f50353a, "com.google.android.gms.ocr");
            Context context = a.f50364e;
            IBinder a2 = a.mo29007a("com.google.android.gms.ocr.credit.dynamite.CreditCardOcrFragmentDelegateImpl");
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ocr.ICreditCardOcrFragmentDelegate");
                if (!(queryLocalInterface instanceof akpj)) {
                    akpj = new akph(a2);
                } else {
                    akpj = (akpj) queryLocalInterface;
                }
            } else {
                akpj = null;
            }
            akpj.mo39647a(vzs.m41642a(activity), vzs.m41642a(context), bundle, akpg);
            this.f72375a = akpj;
        } catch (RemoteException | wam e) {
            throw new RuntimeException(e);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            this.f72375a.mo39649b(bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f72375a.mo39645a(vzs.m41642a(activity));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f72375a.mo39644a(bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return (View) vzs.m41641a(this.f72375a.mo39648b(vzs.m41642a(layoutInflater), vzs.m41642a(viewGroup), bundle));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        try {
            this.f72375a.mo39646a(vzs.m41642a(activity), vzs.m41642a(attributeSet), bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onPause() {
        super.onPause();
        try {
            this.f72375a.mo39652d();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onResume() {
        super.onResume();
        try {
            this.f72375a.mo39650c();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            this.f72375a.mo39651c(bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onStart() {
        super.onStart();
        try {
            this.f72375a.mo39643a();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onStop() {
        super.onPause();
        try {
            this.f72375a.mo39653e();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
