package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: bkef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkef extends Fragment implements C0013ak {

    /* renamed from: Dx */
    private C0015am f124078Dx = new C0015am(this);

    /* renamed from: as */
    public final bkfx mo65891as() {
        return (bkfx) getChildFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ca */
    public boolean mo52781ca() {
        return false;
    }

    public final C0008af getLifecycle() {
        return this.f124078Dx;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo52781ca()) {
            this.f124078Dx = new C0015am(this);
            if (mo65891as() == null) {
                getChildFragmentManager().beginTransaction().add(new bkfx(), "ViewModelHolderFragment").commitNow();
            }
            this.f124078Dx.mo1023a(C0005ad.ON_CREATE);
        }
    }

    public final void onDestroy() {
        C0015am amVar = this.f124078Dx;
        if (amVar != null) {
            amVar.mo1023a(C0005ad.ON_DESTROY);
        }
        super.onDestroy();
    }

    public void onPause() {
        C0015am amVar = this.f124078Dx;
        if (amVar != null) {
            amVar.mo1023a(C0005ad.ON_PAUSE);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C0015am amVar = this.f124078Dx;
        if (amVar != null) {
            amVar.mo1023a(C0005ad.ON_RESUME);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C0015am amVar = this.f124078Dx;
        if (amVar != null) {
            amVar.mo1023a(C0005ad.ON_STOP);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        C0015am amVar = this.f124078Dx;
        if (amVar != null) {
            amVar.mo1023a(C0005ad.ON_START);
        }
    }

    public void onStop() {
        C0015am amVar = this.f124078Dx;
        if (amVar != null) {
            amVar.mo1023a(C0005ad.ON_STOP);
        }
        super.onStop();
    }
}
