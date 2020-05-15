package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.analytics.AppValidationResult;
import java.util.ArrayList;

/* renamed from: bjzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjzn extends Fragment {

    /* renamed from: a */
    private bjzm f123693a;

    /* renamed from: b */
    public int f123694b = -1;

    /* renamed from: c */
    boolean f123695c = false;

    /* renamed from: d */
    private Handler f123696d;

    /* renamed from: e */
    private boolean f123697e;

    /* renamed from: f */
    private int f123698f = -1;

    /* renamed from: a */
    private final void m104997a() {
        bjzm bjzm = this.f123693a;
        if (bjzm != null) {
            bkiz bkiz = (bkiz) bjzm;
            if (equals(bkiz.f124345g)) {
                int i = this.f123694b;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Unexpected sidecar state: ");
                            sb.append(i);
                            Log.e("DummyFormFragment", sb.toString());
                        } else {
                            bkiz.f124339a = true;
                            bjzk bjzk = bkiz.f124345g;
                            ArrayList arrayList = new ArrayList(bjzk.f123692a.size());
                            for (String str : bjzk.f123692a.keySet()) {
                                AppValidationResult appValidationResult = (AppValidationResult) bjzk.f123692a.getParcelable(str);
                                if (appValidationResult.f151722b == 0) {
                                    arrayList.add(appValidationResult.f151721a);
                                }
                            }
                            bkiz.f124343e = arrayList;
                            bkiz.mo66068t();
                            bjzk bjzk2 = bkiz.f124345g;
                            ArrayList arrayList2 = new ArrayList(bjzk2.f123692a.size());
                            for (String str2 : bjzk2.f123692a.keySet()) {
                                arrayList2.add((AppValidationResult) bjzk2.f123692a.getParcelable(str2));
                            }
                            int size = arrayList2.size();
                            Bundle bundle = new Bundle();
                            for (int i2 = 0; i2 < size; i2++) {
                                AppValidationResult appValidationResult2 = (AppValidationResult) arrayList2.get(i2);
                                bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 777);
                                bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", appValidationResult2.f151722b);
                                bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", appValidationResult2);
                                ((bkge) bjzm).mo51905a(7, bundle);
                            }
                        }
                    }
                } else if (!bkiz.f124339a) {
                    if (((bmki) bkiz.f124069w).f129820q.size() > 0) {
                        bjzk bjzk3 = bkiz.f124345g;
                        Activity activity = ((Fragment) bjzm).getActivity();
                        bxwc bxwc = ((bmki) bkiz.f124069w).f129820q;
                        new bjzj(bjzk3, activity, ((bkge) bjzm).mo65980at()).execute((bmkd[]) bxwc.toArray(new bmkd[bxwc.size()]));
                    } else if (bkiz.mo66066m()) {
                        bkiz.f124339a = true;
                        bkiz.f124343e = new ArrayList();
                        bkiz.mo66068t();
                    } else {
                        throw new IllegalStateException("No native apps to validate and no web flow fallback");
                    }
                }
                this.f123695c = false;
                return;
            }
            throw new IllegalArgumentException("Unexpected sidecar");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle == null) {
            mo65664a(0);
        } else {
            mo65662a(bundle);
        }
        this.f123697e = true;
    }

    public final void onDestroy() {
        this.f123697e = false;
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        if (this.f123696d == null) {
            this.f123696d = new adzt();
        }
        this.f123696d.post(new bjzl());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SidecarFragment.state", this.f123694b);
        bundle.putInt("SidecarFragment.substate", this.f123698f);
        bundle.putBoolean("SidecarFragment.notifyListenerOfStateChange", this.f123695c);
    }

    /* renamed from: a */
    public final void mo65664a(int i) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must be called from the UI thread.");
        } else if (i != this.f123694b || this.f123698f != 0) {
            this.f123694b = i;
            this.f123698f = 0;
            this.f123695c = true;
            m104997a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65662a(Bundle bundle) {
        this.f123694b = bundle.getInt("SidecarFragment.state");
        this.f123698f = bundle.getInt("SidecarFragment.substate");
        boolean z = bundle.getBoolean("SidecarFragment.notifyListenerOfStateChange");
        this.f123695c = z;
        if (this.f123694b == 1) {
            mo65664a(0);
        } else if (z) {
            m104997a();
        }
    }

    /* renamed from: a */
    public final void mo65665a(bjzm bjzm) {
        this.f123693a = bjzm;
        if (bjzm != null && this.f123697e && this.f123695c) {
            m104997a();
        }
    }
}
