package p000;

import android.animation.AnimatorInflater;
import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import com.google.android.gms.udc.ConsentFlowConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: avhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avhz extends Fragment implements sur {

    /* renamed from: l */
    public static final /* synthetic */ int f93194l = 0;

    /* renamed from: m */
    private static final srn f93195m = srn.m36124a();

    /* renamed from: a */
    protected ImageLoader f93196a;

    /* renamed from: b */
    protected String f93197b;

    /* renamed from: c */
    protected avih f93198c;

    /* renamed from: d */
    protected aviv f93199d;

    /* renamed from: e */
    protected avhy f93200e;

    /* renamed from: f */
    protected avhx f93201f;

    /* renamed from: g */
    protected CharSequence f93202g;

    /* renamed from: h */
    protected ViewGroup f93203h;

    /* renamed from: i */
    protected avjn f93204i;

    /* renamed from: j */
    protected int f93205j = 0;

    /* renamed from: k */
    protected boolean f93206k;

    /* renamed from: n */
    private boolean f93207n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo51250a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51251a(ViewGroup viewGroup) {
        int i = Build.VERSION.SDK_INT;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration((long) getResources().getInteger(C0126R.integer.udc_setting_zippy_anim_duration));
        layoutTransition.enableTransitionType(4);
        viewGroup.setLayoutTransition(layoutTransition);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51252a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, bxru bxru);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51253a(avhb avhb, boolean z, boolean z2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51256b() {
        int i = Build.VERSION.SDK_INT;
        View decorView = getActivity().getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1280);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo51258c() {
        this.f93204i.mo51292a(29009, this.f93205j);
        avhy avhy = this.f93200e;
        avih avih = this.f93198c;
        bxvd da = bxso.f164714b.mo74144da();
        ArrayList arrayList = avih.f93228a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ByteString a = ByteString.m123261a((byte[]) arrayList.get(i));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxso bxso = (bxso) da.f164949b;
                a.getClass();
                if (!bxso.f164716a.mo73666a()) {
                    bxso.f164716a = GeneratedMessageLite.m124021a(bxso.f164716a);
                }
                bxso.f164716a.add(a);
            }
        }
        avhy.mo51248a((bxso) da.mo74062i());
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f93200e = (avhy) activity;
        this.f93201f = (avhx) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (avgy.f93170a == null) {
            avgy.f93170a = new ImageLoader(rpr.m34216b().getRequestQueue(), new avgx(Math.min(3145728, (int) (Runtime.getRuntime().maxMemory() / 8))));
        }
        this.f93196a = avgy.f93170a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        avih avih = new avih(new avin(this));
        this.f93198c = avih;
        avih.f93228a = new ArrayList();
        Bundle arguments = getArguments();
        bxru bxru = (bxru) avih.m78571a(arguments, "UdcConsentConfig", (bxxk) bxru.f164610n.mo74142c(7));
        sdo.checkIfNull(bxru, "Fragment requires consent configuration");
        ConsentFlowConfig consentFlowConfig = (ConsentFlowConfig) arguments.getParcelable("UdcConsentFlowConfig");
        Context context = layoutInflater.getContext();
        int i = consentFlowConfig.f109334d;
        int i2 = 2132019965;
        if (i == 1) {
            i2 = 2132019956;
        } else if (i == 2) {
            i2 = 2132019955;
        } else if (i == 4) {
            i2 = 2132019957;
        } else if (i == 5) {
            i2 = 2132019958;
        } else if (i != 6) {
            i2 = 2132019954;
        } else if (chay.f188218a.mo6606a().mo84893b()) {
            int i3 = consentFlowConfig.f109337g;
            if (i3 != 0) {
                if (i3 != 1) {
                    i2 = i3 != 3 ? !chay.m147945b() ? 2132019964 : 2132019961 : !chay.m147945b() ? 2132019966 : 2132019963;
                } else if (chay.m147945b()) {
                    i2 = 2132019962;
                }
            } else if (!chay.f188218a.mo6606a().mo84895d()) {
                i2 = !chay.m147945b() ? 2132019964 : 2132019961;
            } else if (chay.m147945b()) {
                i2 = 2132019962;
            }
        } else {
            i2 = !chay.m147945b() ? 2132019964 : 2132019961;
        }
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(context, i2));
        this.f93197b = arguments.getString("UdcAccountName");
        this.f93199d = new aviv(arguments.getIntegerArrayList("UdcConsentZippyStates"), this.f93201f, this);
        ViewGroup viewGroup2 = (ViewGroup) cloneInContext.inflate(mo51250a(), viewGroup, false);
        this.f93203h = viewGroup2;
        Spanned spanned = null;
        if (viewGroup2 == null) {
            bnsl bnsl = (bnsl) f93195m.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("avhz", "onCreateView", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to inflate fragment view");
            return null;
        }
        ((ScrollViewWithEvents) viewGroup2.findViewById(C0126R.C0129id.udc_consent_scroll_view)).f30408a = this;
        this.f93205j = arguments.getInt("UdcClearcutEventFlowId", 0);
        this.f93204i = new avjn(getActivity(), this.f93197b);
        bxsk bxsk = bxru.f164617f;
        if (bxsk == null) {
            bxsk = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk)) {
            bxsk bxsk2 = bxru.f164617f;
            if (bxsk2 == null) {
                bxsk2 = bxsk.f164695d;
            }
            avin avin = new avin(this);
            if (!avih.m78576a(bxsk2)) {
                spanned = avhd.m78503a(bxsk2.f164699c, avin);
            }
            this.f93202g = spanned;
        }
        mo51252a(this.f93203h, cloneInContext, consentFlowConfig, bxru);
        ViewGroup viewGroup3 = (ViewGroup) this.f93203h.findViewById(C0126R.C0129id.action_container);
        if ((bxru.f164612a & 4096) != 0) {
            avih avih2 = this.f93198c;
            bxrg bxrg = bxru.f164624m;
            if (bxrg == null) {
                bxrg = bxrg.f164554b;
            }
            bxsk bxsk3 = bxrg.f164556a;
            if (bxsk3 == null) {
                bxsk3 = bxsk.f164695d;
            }
            avih2.mo51262a(viewGroup3, (int) C0126R.C0129id.action_button_negative, bxsk3).setOnClickListener(new avhw(this));
        }
        if ((bxru.f164612a & 2048) != 0) {
            avih avih3 = this.f93198c;
            bxrg bxrg2 = bxru.f164623l;
            if (bxrg2 == null) {
                bxrg2 = bxrg.f164554b;
            }
            bxsk bxsk4 = bxrg2.f164556a;
            if (bxsk4 == null) {
                bxsk4 = bxsk.f164695d;
            }
            avih3.mo51262a(viewGroup3, (int) C0126R.C0129id.action_button_positive, bxsk4).setOnClickListener(new avhv(this));
        }
        if (consentFlowConfig.f109335e == 1) {
            ((LinearLayout.LayoutParams) viewGroup3.findViewById(C0126R.C0129id.action_button_spacer).getLayoutParams()).weight = 1.0f;
        }
        return this.f93203h;
    }

    public final void onResume() {
        super.onResume();
        if (!TextUtils.isEmpty(this.f93202g)) {
            avih.m78575a(this.f93203h, this.f93202g);
        }
    }

    /* renamed from: a */
    public void mo26132a(ScrollView scrollView, boolean z) {
        if (z) {
            boolean z2 = this.f93206k;
            this.f93207n = !z2;
            avjn avjn = this.f93204i;
            int i = this.f93205j;
            bxvd da = bspq.f146567d.mo74144da();
            bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
            bsmt bsmt = bsmt.UDC_MOBILE;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp = (bspp) bxvf.f164949b;
            bspp.f146556b = bsmt.f145305dO;
            int i2 = bspp.f146555a | 1;
            bspp.f146555a = i2;
            bspp.f146557c = 29017;
            int i3 = i2 | 2;
            bspp.f146555a = i3;
            int i4 = i3 | 16;
            bspp.f146555a = i4;
            bspp.f146560f = false;
            bspp.f146555a = i4 | 8;
            bspp.f146559e = z2 ? 1 : 0;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspq bspq = (bspq) da.f164949b;
            bspp bspp2 = (bspp) bxvf.mo74062i();
            bspp2.getClass();
            bspq.f146570b = bspp2;
            bspq.f146569a |= 1;
            avjn.mo51295a((bspq) da.mo74062i(), i);
            this.f93206k = true;
            return;
        }
        avjn avjn2 = this.f93204i;
        boolean z3 = this.f93207n;
        int i5 = this.f93205j;
        bxvd da2 = bspq.f146567d.mo74144da();
        bxvf bxvf2 = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt2 = bsmt.UDC_MOBILE;
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        bspp bspp3 = (bspp) bxvf2.f164949b;
        bspp3.f146556b = bsmt2.f145305dO;
        int i6 = bspp3.f146555a | 1;
        bspp3.f146555a = i6;
        bspp3.f146557c = 29018;
        int i7 = i6 | 2;
        bspp3.f146555a = i7;
        int i8 = i7 | 16;
        bspp3.f146555a = i8;
        bspp3.f146560f = false;
        bspp3.f146555a = i8 | 8;
        bspp3.f146559e = z3 ? 1 : 0;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspq bspq2 = (bspq) da2.f164949b;
        bspp bspp4 = (bspp) bxvf2.mo74062i();
        bspp4.getClass();
        bspq2.f146570b = bspp4;
        bspq2.f146569a = 1 | bspq2.f146569a;
        avjn2.mo51295a((bspq) da2.mo74062i(), i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo51257b(bxsj bxsj, View view) {
        avih avih = this.f93198c;
        bxsk bxsk = bxsj.f164691c;
        if (bxsk == null) {
            bxsk = bxsk.f164695d;
        }
        avih.mo51262a(view, (int) C0126R.C0129id.header, bxsk);
        avih avih2 = this.f93198c;
        bxsk bxsk2 = bxsj.f164693e;
        if (bxsk2 == null) {
            bxsk2 = bxsk.f164695d;
        }
        avih2.mo51262a(view, (int) C0126R.C0129id.udc_description, bxsk2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51254a(bxsj bxsj, View view) {
        avih avih = this.f93198c;
        bxsc bxsc = bxsj.f164692d;
        if (bxsc == null) {
            bxsc = bxsc.f164659d;
        }
        avih.mo51263a(view, (int) C0126R.C0129id.icon, bxsc, this.f93196a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016d  */
    /* renamed from: a */
    public final boolean mo51255a(LayoutInflater layoutInflater, avhb avhb, bxru bxru, ConsentFlowConfig consentFlowConfig, int i) {
        Object obj;
        Object obj2;
        boolean z;
        aviv aviv;
        boolean z2;
        avhb avhb2 = avhb;
        bxru bxru2 = bxru;
        ConsentFlowConfig consentFlowConfig2 = consentFlowConfig;
        boolean z3 = false;
        if (bxru2.f164620i.size() <= 0) {
            return false;
        }
        aviv aviv2 = this.f93199d;
        int size = bxru2.f164620i.size();
        while (true) {
            obj = null;
            if (aviv2.f93253a.size() >= size) {
                break;
            }
            aviv2.f93253a.add(null);
        }
        int i2 = 0;
        boolean z4 = false;
        while (i2 < bxru2.f164620i.size()) {
            bxsj bxsj = (bxsj) bxru2.f164620i.get(i2);
            bxwc bxwc = bxsj.f164694f;
            int size2 = bxwc.size();
            boolean z5 = false;
            for (int i3 = 0; i3 < size2; i3++) {
                z5 = !avih.m78576a((bxsk) bxwc.get(i3));
            }
            bxsk bxsk = bxsj.f164691c;
            if (bxsk == null) {
                bxsk = bxsk.f164695d;
            }
            if (avih.m78576a(bxsk)) {
                bxsk bxsk2 = bxsj.f164693e;
                if (bxsk2 == null) {
                    bxsk2 = bxsk.f164695d;
                }
                if (avih.m78576a(bxsk2) && !z5) {
                    obj2 = obj;
                    i2++;
                    obj = obj2;
                }
            }
            mo51253a(avhb2, z4, z3);
            View a = avhb2.mo51218a(i);
            if (a != null) {
                if ((bxsj.f164689a & 4) != 0 && consentFlowConfig2.f109332b) {
                    mo51254a(bxsj, a);
                }
                mo51257b(bxsj, a);
                ViewGroup viewGroup = (ViewGroup) a.findViewById(C0126R.C0129id.udc_consent_info_texts);
                if (bxsj.f164694f.size() > 0) {
                    avhb avhb3 = new avhb(layoutInflater, viewGroup);
                    viewGroup.setVisibility(z3 ? 1 : 0);
                    bxwc bxwc2 = bxsj.f164694f;
                    int size3 = bxwc2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        TextView textView = (TextView) avhb3.mo51218a(C0126R.C0128layout.udc_consent_setting_info);
                        this.f93198c.mo51264a(textView, (bxsk) bxwc2.get(i4), this.f93197b);
                        textView.setClickable(false);
                        textView.setLongClickable(false);
                    }
                    if (!consentFlowConfig2.f109331a) {
                        z = true;
                        aviv = this.f93199d;
                        if (i2 >= aviv.f93253a.size()) {
                            CheckBox checkBox = (CheckBox) a.findViewById(C0126R.C0129id.zippy);
                            if (checkBox == null) {
                                z3 = false;
                                z4 = true;
                                obj2 = null;
                            } else if (z) {
                                aviu aviu = new aviu(a.findViewById(C0126R.C0129id.udc_consent_info_texts), checkBox, i2, aviv.f93254b);
                                Integer num = (Integer) aviv.f93253a.get(i2);
                                if (num == null) {
                                    z2 = consentFlowConfig2.f109331a;
                                } else {
                                    z2 = num.intValue() == 1;
                                }
                                checkBox.setChecked(z2);
                                checkBox.setOnCheckedChangeListener(aviu);
                                View findViewById = a.findViewById(C0126R.C0129id.header_container);
                                findViewById.setOnClickListener(aviu);
                                int i5 = Build.VERSION.SDK_INT;
                                findViewById.setAccessibilityDelegate(new avit(aviv, checkBox));
                                int i6 = Build.VERSION.SDK_INT;
                                checkBox.setStateListAnimator(AnimatorInflater.loadStateListAnimator(aviv.f93255c.getActivity(), C0126R.anim.zippy));
                                obj2 = null;
                                aviu.onCheckedChanged(null, z2);
                                z3 = false;
                                checkBox.setVisibility(0);
                                z4 = true;
                            } else {
                                z3 = false;
                                obj2 = null;
                                checkBox.setVisibility(8);
                                aviv.f93253a.set(i2, null);
                            }
                        } else {
                            z3 = false;
                            obj2 = null;
                        }
                        z4 = true;
                    }
                }
                z = false;
                aviv = this.f93199d;
                if (i2 >= aviv.f93253a.size()) {
                }
                z4 = true;
            } else {
                obj2 = obj;
                z4 = false;
            }
            i2++;
            obj = obj2;
        }
        return z4;
    }
}
