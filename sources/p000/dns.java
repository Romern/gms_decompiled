package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;

/* renamed from: dns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dns extends Fragment implements aom, aok, aol, ano {

    /* renamed from: a */
    public aon f13641a;

    /* renamed from: b */
    public RecyclerView f13642b;

    /* renamed from: c */
    private boolean f13643c;

    /* renamed from: d */
    private boolean f13644d;

    /* renamed from: e */
    private Context f13645e;

    /* renamed from: f */
    private int f13646f = C0126R.C0128layout.preference_list_fragment;

    /* renamed from: g */
    private final dno f13647g = new dno(this);

    /* renamed from: h */
    private final Handler f13648h = new dnm(this);

    /* renamed from: i */
    private final Runnable f13649i = new dnn(this);

    /* renamed from: d */
    private final void mo17248d() {
        if (this.f13641a == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public RecyclerView mo9316a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate((int) C0126R.C0128layout.preference_recyclerview, viewGroup, false);
        getActivity();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setAccessibilityDelegateCompat(new aop(recyclerView));
        return recyclerView;
    }

    /* renamed from: a */
    public final PreferenceScreen mo9317a() {
        return this.f13641a.f1884c;
    }

    /* renamed from: b */
    public final void mo9320b() {
        PreferenceScreen a = mo9317a();
        if (a != null) {
            this.f13642b.setAdapter(new aoi(a));
            a.mo2011o();
        }
    }

    /* renamed from: c */
    public abstract void mo9322c();

    /* renamed from: c */
    public boolean mo2233c(Preference preference) {
        if (preference.f1605u == null || !(getActivity() instanceof dnq)) {
            return false;
        }
        return ((dnq) getActivity()).mo9314a(preference);
    }

    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen a;
        super.onActivityCreated(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (a = mo9317a()) != null) {
            a.mo1985b(bundle2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C0126R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i > 0) {
            this.f13645e = new ContextThemeWrapper(getActivity(), i);
            aon aon = new aon(this.f13645e);
            this.f13641a = aon;
            aon.f1887f = this;
            if (getArguments() != null) {
                getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
            }
            mo9322c();
            return;
        }
        throw new IllegalStateException("Must specify preferenceTheme in theme");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.f13645e.obtainStyledAttributes(null, dnt.f13650a, C0126R.attr.preferenceFragmentCompatStyle, 0);
        this.f13646f = obtainStyledAttributes.getResourceId(0, this.f13646f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C0126R.attr.preferenceTheme, typedValue, true);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), typedValue.resourceId));
        View inflate = cloneInContext.inflate(this.f13646f, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView a = mo9316a(cloneInContext, viewGroup2, bundle);
            if (a != null) {
                this.f13642b = a;
                a.addItemDecoration(this.f13647g);
                dno dno = this.f13647g;
                if (drawable != null) {
                    dno.f13639b = drawable.getIntrinsicHeight();
                } else {
                    dno.f13639b = 0;
                }
                dno.f13638a = drawable;
                dno.f13640c.f13642b.invalidateItemDecorations();
                if (dimensionPixelSize != -1) {
                    dno dno2 = this.f13647g;
                    dno2.f13639b = dimensionPixelSize;
                    dno2.f13640c.f13642b.invalidateItemDecorations();
                }
                viewGroup2.addView(this.f13642b);
                this.f13648h.post(this.f13649i);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        PreferenceScreen a;
        this.f13648h.removeCallbacks(this.f13649i);
        this.f13648h.removeMessages(1);
        if (this.f13643c && (a = mo9317a()) != null) {
            a.mo2012p();
        }
        this.f13642b = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen a = mo9317a();
        if (a != null) {
            Bundle bundle2 = new Bundle();
            a.mo1977a(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        aon aon = this.f13641a;
        aon.f1885d = this;
        aon.f1886e = this;
    }

    public final void onStop() {
        super.onStop();
        aon aon = this.f13641a;
        aon.f1885d = null;
        aon.f1886e = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f13643c) {
            mo9320b();
        }
        this.f13644d = true;
    }

    /* renamed from: a */
    public final Preference mo2204a(CharSequence charSequence) {
        aon aon = this.f13641a;
        if (aon != null) {
            return aon.mo2235a(charSequence);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo2231b(Preference preference) {
        DialogFragment dialogFragment;
        if ((!(getActivity() instanceof dnp) || !((dnp) getActivity()).mo9313a()) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.f1603s;
                dialogFragment = new dnh();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                dialogFragment.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.f1603s;
                dialogFragment = new dnj();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                dialogFragment.setArguments(bundle2);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: a */
    public final void mo9318a(int i) {
        mo17248d();
        mo9321b(this.f13641a.mo2236a(this.f13645e, i, mo9317a()));
    }

    /* renamed from: a */
    public void mo2232a(PreferenceScreen preferenceScreen) {
        if (getActivity() instanceof dnr) {
            ((dnr) getActivity()).mo9315a();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final void mo9319a(String str) {
        mo17248d();
        PreferenceScreen a = this.f13641a.mo2236a(this.f13645e, C0126R.xml.car_preferences, null);
        Object obj = a;
        if (str != null) {
            Object c = a.mo2021c((CharSequence) str);
            boolean z = c instanceof PreferenceScreen;
            obj = c;
            if (!z) {
                StringBuilder sb = new StringBuilder(str.length() + 53);
                sb.append("Preference object with key ");
                sb.append(str);
                sb.append(" is not a PreferenceScreen");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        mo9321b((PreferenceScreen) obj);
    }

    /* renamed from: b */
    public final void mo9321b(PreferenceScreen preferenceScreen) {
        aon aon = this.f13641a;
        PreferenceScreen preferenceScreen2 = aon.f1884c;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.mo2012p();
            }
            aon.f1884c = preferenceScreen;
            if (preferenceScreen != null) {
                this.f13643c = true;
                if (this.f13644d && !this.f13648h.hasMessages(1)) {
                    this.f13648h.obtainMessage(1).sendToTarget();
                }
            }
        }
    }
}
