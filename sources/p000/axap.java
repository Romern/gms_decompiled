package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: axap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axap extends awzb implements bjwh, bjwp, bjwm, bkdb {

    /* renamed from: d */
    TextView f95540d;

    /* renamed from: e */
    final ArrayList f95541e = new ArrayList(2);

    /* renamed from: f */
    public bjwk f95542f;

    /* renamed from: g */
    public axao f95543g;

    /* renamed from: h */
    boolean f95544h = false;

    /* renamed from: i */
    private bwhw f95545i;

    /* renamed from: j */
    private final ArrayList f95546j = new ArrayList(2);

    /* renamed from: W */
    public final long mo52837W() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9306a() {
        awib awib = this.f95345b;
        if (awib != null) {
            awib.mo51872b(!this.f95344a);
        }
        boolean z = this.f95344a;
        TextView textView = this.f95540d;
        if (textView != null) {
            textView.setEnabled(z);
        }
        int size = this.f95541e.size();
        for (int i = 0; i < size; i++) {
            ((awzs) this.f95541e.get(i)).mo52808n(z);
        }
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f95542f = bjwk;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        int size = this.f95541e.size();
        for (int i = 0; i < size; i++) {
            ((awzs) this.f95541e.get(i)).mo52947bY();
        }
    }

    /* renamed from: c */
    public final boolean mo52948c() {
        return isResumed() && bkde.m105359l(this.f95346c);
    }

    /* renamed from: d */
    public final void mo52949d() {
        if (this.f95544h && this.f95542f != null) {
            int size = this.f95546j.size();
            for (int i = 0; i < size; i++) {
                this.f95542f.mo65590a((bjwj) this.f95546j.get(i));
            }
            this.f95546j.clear();
        }
        this.f95544h = false;
    }

    /* renamed from: f */
    public final bwhx mo52950f() {
        bxvd da = bwhx.f159598d.mo74144da();
        ByteString bxtx = this.f95545i.f159593f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwhx bwhx = (bwhx) da.f164949b;
        bxtx.getClass();
        bwhx.f159600a |= 1;
        bwhx.f159602c = bxtx;
        int size = this.f95541e.size();
        for (int i = 0; i < size; i++) {
            bmed c = ((awzs) this.f95541e.get(i)).mo52944a(Bundle.EMPTY);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwhx bwhx2 = (bwhx) da.f164949b;
            c.getClass();
            if (!bwhx2.f159601b.mo73666a()) {
                bwhx2.f159601b = GeneratedMessageLite.m124021a(bwhx2.f159601b);
            }
            bwhx2.f159601b.add(c);
        }
        return (bwhx) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        awzs awzs;
        Bundle arguments = getArguments();
        this.f95545i = (bwhw) bjvp.m104730a(arguments, "filterCategoryProto", (bxxk) bwhw.f159586i.mo74142c(7));
        int i = arguments.getInt("themeResourceId");
        String string = arguments.getString("analyticsSessionId");
        LogContext logContext = (LogContext) arguments.getParcelable("parentLogContext");
        boolean z = false;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_filter_category_dialog, viewGroup, false);
        this.f95345b = (ProgressSpinnerView) inflate.findViewById(C0126R.C0129id.progress_spinner_container);
        mo9306a();
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.filter_category_title);
        this.f95540d = textView;
        textView.setText(this.f95545i.f159591d);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0126R.C0129id.simple_form_container);
        this.f95541e.clear();
        this.f95346c.clear();
        bxwc bxwc = this.f95545i.f159594g;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            bmeb bmeb = (bmeb) bxwc.get(i2);
            if (bundle == null) {
                awzs = awzs.m81799a(bmeb, i, string, false, logContext);
                FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                int id = viewGroup2.getId();
                bmdn bmdn = bmeb.f128905b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                beginTransaction.add(id, awzs, bmdn.f128834b).commit();
            } else {
                FragmentManager childFragmentManager = getChildFragmentManager();
                bmdn bmdn2 = bmeb.f128905b;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                awzs = (awzs) childFragmentManager.findFragmentByTag(bmdn2.f128834b);
            }
            awzs.f124196aK = this.f95542f;
            this.f95541e.add(awzs);
            this.f95346c.add(new bkde(awzs));
        }
        bjwl.m104784a(this, this.f95545i.f159590c, this.f95542f);
        if (bundle == null) {
            z = true;
        }
        this.f95544h = z;
        if (mo52948c()) {
            mo52949d();
        }
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
        }
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo52947bY();
        bjwl.m104790b(this, this.f95545i.f159590c, this.f95542f);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = new ArrayList();
        int size = this.f95541e.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((awzs) this.f95541e.get(i)).f124404f.getVisibility()));
        }
        bundle.putIntegerArrayList("fragmentsVisibility", arrayList);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("fragmentsVisibility");
            int size = this.f95541e.size();
            for (int i = 0; i < size; i++) {
                ((awzs) this.f95541e.get(i)).f124404f.setVisibility(integerArrayList.get(i).intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i == 4 && mo52948c()) {
            mo52949d();
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 11) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "FilterCategoryDialogFragment does not handle resulting action type %s", objArr));
        }
        ((axaq) this.f95543g).f95549c = mo52950f();
        dismiss();
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 6) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
            }
            this.f95546j.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        int a = bmna.m108191a(bmne.f130094d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 == 6) {
            return true;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = Integer.valueOf(i - 1);
        throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
    }
}
