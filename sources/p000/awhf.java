package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* renamed from: awhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awhf extends Fragment implements bkcy {

    /* renamed from: a */
    Account f94349a;

    /* renamed from: b */
    awhc f94350b;

    /* renamed from: c */
    String[] f94351c;

    /* renamed from: d */
    int f94352d = -1;

    /* renamed from: e */
    public awhd f94353e;

    /* renamed from: f */
    bkcz f94354f;

    /* renamed from: g */
    public awhe f94355g;

    /* renamed from: h */
    private boolean f94356h = false;

    /* renamed from: a */
    public static awhf m79933a(Account account, String... strArr) {
        awhf awhf = new awhf();
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putStringArray("tokenTypes", strArr);
        awhf.setArguments(bundle);
        return awhf;
    }

    /* renamed from: b */
    private final void m79935b() {
        if (this.f94351c.length == 0) {
            mo52166a(0);
        } else if (m79936c()) {
            this.f94352d++;
            m79938e();
        } else {
            throw new NoSuchElementException("No TokenTypes remain");
        }
    }

    /* renamed from: c */
    private final boolean m79936c() {
        return this.f94352d + 1 < this.f94351c.length;
    }

    /* renamed from: d */
    private final String m79937d() {
        return this.f94351c[this.f94352d];
    }

    /* renamed from: e */
    private final void m79938e() {
        awhc awhc = new awhc(this, getActivity().getApplicationContext());
        this.f94350b = awhc;
        awhc.execute(m79937d());
    }

    /* renamed from: a */
    public final void mo52167a(awhd awhd) {
        this.f94356h = true;
        this.f94353e = awhd;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f94352d < 0) {
            m79935b();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i != 501) {
            return;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 == 1) {
                    mo52166a(2);
                    return;
                } else if (i2 == 3) {
                    mo52166a(3);
                    return;
                } else if (i2 != 4) {
                    mo52166a(0);
                    return;
                }
            }
            awhd awhd = this.f94353e;
            if (awhd == null) {
                this.f94355g = new awhe(2);
            } else {
                awhd.mo52164x();
            }
        } else {
            String str = null;
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("authtoken");
            }
            mo52169a(str);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!this.f94356h) {
            m79934a(activity);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        sdo.m34966a(getArguments(), "Fragment requires arguments!");
        sdo.m34975b(arguments.containsKey("account"), "Fragment requires account extra!");
        this.f94349a = (Account) arguments.getParcelable("account");
        sdo.m34975b(arguments.containsKey("tokenTypes"), "Fragment requires tokenTypes extra!");
        HashSet hashSet = new HashSet(Arrays.asList(arguments.getStringArray("tokenTypes")));
        this.f94351c = (String[]) hashSet.toArray(new String[0]);
        awec a = awec.m79679a();
        Account account = this.f94349a;
        String[] strArr = this.f94351c;
        synchronized (a.f94196b) {
            for (String str : strArr) {
                a.f94196b.add(awec.m79680a(account, str));
            }
        }
    }

    public final void onDetach() {
        super.onDetach();
        this.f94353e = null;
    }

    public final void onResume() {
        super.onResume();
        bkcz bkcz = (bkcz) getFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment.ERROR_DIALOG");
        this.f94354f = bkcz;
        if (bkcz != null) {
            bkcz.f124032a = this;
        }
        if (this.f94355g != null) {
            m79934a(getActivity());
            awhe awhe = this.f94355g;
            int i = awhe.f94347a;
            if (i == 1) {
                this.f94353e.mo52163w();
            } else if (i != 2) {
                this.f94353e.mo52162d(awhe.f94348b);
            } else {
                this.f94353e.mo52164x();
            }
            this.f94355g = null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f94353e = null;
    }

    /* renamed from: a */
    private final void m79934a(Activity activity) {
        if (this.f94353e == null) {
            try {
                this.f94353e = (awhd) activity;
            } catch (ClassCastException e) {
                throw new IllegalStateException(String.format("%s must implement OnAuthTokensRetrievedListener or a listener must be set", activity));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52165a() {
        mo52168a(bkcz.m105337a(1, (int) C0126R.string.wallet_uic_unknown_authentication_error_title, (int) C0126R.string.wallet_uic_unknown_authentication_error_message, 1002));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52166a(int i) {
        awhd awhd = this.f94353e;
        if (awhd == null) {
            this.f94355g = new awhe(i, null);
        } else {
            awhd.mo52162d(i);
        }
    }

    /* renamed from: a */
    public final void mo52044a(int i, int i2) {
        if (i2 != 1000) {
            if (i2 != 1002) {
                Log.e("RetrieveAuthTokensFragment", String.format("Unknown error dialog error code: %d", Integer.valueOf(i2)));
                return;
            }
            mo52166a(0);
        } else if (i == 1) {
            m79938e();
        } else if (i != 2) {
            Log.e("RetrieveAuthTokensFragment", String.format("Unknown button pressed: %d", Integer.valueOf(i)));
        } else {
            awhd awhd = this.f94353e;
            if (awhd == null) {
                this.f94355g = new awhe(2);
            } else {
                awhd.mo52164x();
            }
        }
    }

    /* renamed from: a */
    public final void mo52168a(bkcz bkcz) {
        if (this.f94354f != null) {
            getFragmentManager().beginTransaction().remove(this.f94354f).commit();
        }
        this.f94354f = bkcz;
        bkcz.f124032a = this;
        bkcz.show(getFragmentManager(), "RetrieveAuthTokensFragment.ERROR_DIALOG");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52169a(String str) {
        if (TextUtils.isEmpty(str)) {
            m79938e();
            return;
        }
        awec a = awec.m79679a();
        Account account = this.f94349a;
        String d = m79937d();
        synchronized (a.f94196b) {
            a.f94196b.remove(awec.m79680a(account, d));
            a.f94196b.notifyAll();
        }
        if (!m79936c()) {
            awhd awhd = this.f94353e;
            if (awhd == null) {
                this.f94355g = new awhe(1);
            } else {
                awhd.mo52163w();
            }
        } else {
            m79935b();
        }
    }
}
