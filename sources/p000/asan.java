package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.setup.p066ui.ShapeVerificationView;
import com.google.android.setupdesign.GlifLayout;
import java.util.Locale;

/* renamed from: asan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asan extends Fragment {

    /* renamed from: a */
    public static final /* synthetic */ int f88604a = 0;

    /* renamed from: b */
    private static final Logger f88605b = ascp.m73787a("Setup", "UI", "SetupPinVerificationFragment");

    /* renamed from: c */
    private aqzm f88606c;

    /* renamed from: d */
    private GlifLayout f88607d;

    /* renamed from: e */
    private ShapeVerificationView f88608e;

    /* renamed from: f */
    private asam f88609f;

    /* renamed from: g */
    private String f88610g;

    /* renamed from: h */
    private int f88611h;

    /* renamed from: i */
    private boolean f88612i;

    /* renamed from: j */
    private boolean f88613j;

    /* renamed from: k */
    private C1350sh f88614k;

    /* renamed from: a */
    public static asan m73740a(bowh bowh, String str, boolean z, boolean z2, aqzm aqzm) {
        sdo.m34959a((Object) str);
        asan asan = new asan();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.pin", str);
        bowh bowh2 = bowh.DEFAULT;
        int ordinal = bowh.ordinal();
        int i = 4;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal != 4) {
            i = 0;
        }
        bundle.putInt("verificationStyle", i);
        bundle.putBoolean("connectListener", z);
        bundle.putBoolean("isSource", z2);
        bundle.putString("device_type", aqzm.name());
        asan.setArguments(bundle);
        return asan;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        String string = arguments.getString("smartdevice.pin");
        sdo.m34959a((Object) string);
        this.f88610g = string;
        this.f88611h = arguments.getInt("verificationStyle", 0);
        this.f88612i = arguments.getBoolean("connectListener");
        this.f88613j = arguments.getBoolean("isSource");
        this.f88606c = aqzm.m72294a(arguments.getString("device_type"));
        if (this.f88612i) {
            try {
                this.f88609f = (asam) getActivity();
            } catch (ClassCastException e) {
                throw new RuntimeException("Containing activity must implement SetupPinVerificationFragment.Listener", e);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_setup_pin_verification, viewGroup, false);
        this.f88607d = glifLayout;
        biyn biyn = (biyn) glifLayout.mo71342a(biyn.class);
        boolean e = cgou.m146380e();
        int i = C0126R.string.common_confirm;
        if (!e || this.f88606c != aqzm.AUTO) {
            int i2 = this.f88611h;
            GlifLayout glifLayout2 = this.f88607d;
            TextView textView = (TextView) glifLayout2.findViewById(C0126R.C0129id.description);
            if (i2 == 1 || i2 == 2) {
                glifLayout2.mo71365c(!this.f88613j ? C0126R.string.smartdevice_pairing_verify_shapes_title_target : C0126R.string.smartdevice_pairing_verify_shapes_title_source);
            } else {
                glifLayout2.mo71365c(!this.f88613j ? C0126R.string.smartdevice_setup_title_verify_code_target : C0126R.string.smartdevice_setup_title_verify_code_source);
            }
            if (this.f88613j) {
                TypedArray obtainStyledAttributes = glifLayout2.getContext().getTheme().obtainStyledAttributes(2132018229, new int[]{16843660});
                boolean z = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                String string = getString(C0126R.string.common_next);
                if (z) {
                    string = string.toUpperCase(Locale.getDefault());
                }
                textView.setText(TextUtils.expandTemplate(getString(C0126R.string.smartdevice_pairing_verify_confirm), string));
                i = C0126R.string.common_next;
            } else {
                i = C0126R.string.common_next;
            }
        } else {
            int i3 = this.f88611h;
            if (i3 != 0) {
                Logger Logger = f88605b;
                StringBuilder sb = new StringBuilder(101);
                sb.append("Auto does not have copy for verification styles other than PIN right now. Received style: ");
                sb.append(i3);
                Logger.mo25416d(sb.toString(), new Object[0]);
            }
            this.f88607d.mo71365c(C0126R.string.smartdevice_setup_title_auto_confirm_code);
            ((TextView) this.f88607d.findViewById(C0126R.C0129id.description)).setText((int) C0126R.string.smartdevice_setup_auto_confirm_code_subhead);
            Context context = getContext();
            sdo.m34959a(context);
            Drawable a = C1133kh.m17836a(context, (int) C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36);
            if (a != null) {
                this.f88607d.mo71362a(a);
            }
        }
        biyo biyo = new biyo(this.f88607d.getContext());
        biyo.mo64883a(i);
        biyo.f122328c = 5;
        biyo.f122329d = 2132018229;
        biyp a2 = biyo.mo64882a();
        biyo biyo2 = new biyo(this.f88607d.getContext());
        biyo2.mo64883a(C0126R.string.smartdevice_d2d_target_help_text);
        biyo2.f122328c = 7;
        biyo2.f122329d = 2132018230;
        biyp a3 = biyo2.mo64882a();
        biyn.mo52733a(a2);
        biyn.mo52735b(a3);
        this.f88608e = (ShapeVerificationView) this.f88607d.findViewById(C0126R.C0129id.shapesView);
        return this.f88607d;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1350sh shVar = this.f88614k;
        boolean z = false;
        if (shVar != null && shVar.isShowing()) {
            z = true;
        }
        bundle.putBoolean("isDialogActive", z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    public final void onViewCreated(View view, Bundle bundle) {
        Activity activity;
        View view2 = view;
        Bundle bundle2 = bundle;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view2.findViewById(C0126R.C0129id.pin);
        int i = this.f88611h;
        int i2 = 0;
        if (i == 3 || i == 4) {
            textView.setTextSize(0, getResources().getDimension(C0126R.dimen.smartdevice_verification_pin_hex_size));
        }
        int i3 = this.f88611h;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f88608e.f108236c = true;
                } else if (i3 == 3) {
                    textView.setTextColor(C1133kh.m17843b(view.getContext(), C0126R.color.smartdevice_google_blue_600));
                } else if (i3 == 4) {
                    int[] intArray = view.getContext().getResources().getIntArray(C0126R.array.smartdevice_google_500_colors);
                    String str = this.f88610g;
                    int length = intArray.length;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    while (i2 < str.length()) {
                        int i4 = i2 + 1;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(intArray[i2 % length]), i2, i4, 34);
                        i2 = i4;
                    }
                    textView.setText(spannableStringBuilder);
                    biyn biyn = (biyn) ((GlifLayout) view2.findViewById(C0126R.C0129id.glif_layout)).mo71342a(biyn.class);
                    biyp biyp = biyn.f122314f;
                    biyp biyp2 = biyn.f122315g;
                    if (this.f88612i) {
                        asam asam = this.f88609f;
                        if (asam != null) {
                            biyp.f122336f = new asak(asam);
                            biyp2.f122336f = new asal(this, asam);
                            if (bundle2 != null && bundle2.getBoolean("isDialogActive")) {
                                mo49006a(asam);
                            }
                        } else {
                            throw new IllegalStateException("Listener is null");
                        }
                    } else {
                        biyp.mo64885a(8);
                        biyp2.mo64885a(8);
                    }
                    activity = getActivity();
                    if (activity != null) {
                        asbr.m73757a(activity.getContainerActivity(), this.f88607d.mo71367f());
                        return;
                    }
                    return;
                } else {
                    throw new IllegalStateException("Invalid style");
                }
            }
            textView.setVisibility(8);
            this.f88608e.setVisibility(0);
            ShapeVerificationView shapeVerificationView = this.f88608e;
            byte[] a = aroa.m73210a(this.f88610g);
            asao[] asaoArr = a != null ? new asao[]{ShapeVerificationView.m92963a(a[0], a[1], shapeVerificationView.f108235b), ShapeVerificationView.m92963a(a[2], a[3], shapeVerificationView.f108235b), ShapeVerificationView.m92963a(a[4], a[5], shapeVerificationView.f108235b), ShapeVerificationView.m92963a(a[6], a[7], shapeVerificationView.f108235b)} : null;
            if (asaoArr != null) {
                Context context = shapeVerificationView.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0126R.dimen.smartdevice_text_padding);
                int length2 = asaoArr.length;
                for (int i5 = 4; i2 < i5; i5 = 4) {
                    asao asao = asaoArr[i2];
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    asap asap = new asap(context);
                    int i6 = asao.f88617c;
                    int i7 = asao.f88615a;
                    asap.f88619b = i6;
                    asap.f88618a.setColor(i7);
                    asap.f88618a.setStyle(Paint.Style.FILL);
                    asap.f88618a.setAntiAlias(true);
                    asap.setId(16908294);
                    int i8 = shapeVerificationView.f108237d;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i8, i8);
                    layoutParams.leftMargin = shapeVerificationView.f108238e;
                    layoutParams.rightMargin = shapeVerificationView.f108238e;
                    asap.setLayoutParams(layoutParams);
                    linearLayout.addView(asap);
                    if (shapeVerificationView.f108236c) {
                        TextView textView2 = new TextView(context);
                        textView2.setId(16908308);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = dimensionPixelSize;
                        textView2.setLayoutParams(layoutParams2);
                        C1334rs.m20104a(textView2, 2132018190);
                        textView2.setTypeface(ShapeVerificationView.f108234a);
                        textView2.setGravity(1);
                        textView2.setText(asao.f88616b);
                        linearLayout.addView(textView2);
                    }
                    shapeVerificationView.addView(linearLayout);
                    i2++;
                }
            }
            biyn biyn2 = (biyn) ((GlifLayout) view2.findViewById(C0126R.C0129id.glif_layout)).mo71342a(biyn.class);
            biyp biyp3 = biyn2.f122314f;
            biyp biyp22 = biyn2.f122315g;
            if (this.f88612i) {
            }
            activity = getActivity();
            if (activity != null) {
            }
        }
        textView.setText(this.f88610g);
        biyn biyn22 = (biyn) ((GlifLayout) view2.findViewById(C0126R.C0129id.glif_layout)).mo71342a(biyn.class);
        biyp biyp32 = biyn22.f122314f;
        biyp biyp222 = biyn22.f122315g;
        if (this.f88612i) {
        }
        activity = getActivity();
        if (activity != null) {
        }
    }

    /* renamed from: a */
    public final void mo49006a(asam asam) {
        asaj asaj = new asaj(asam);
        if (!cgou.m146380e() || this.f88606c != aqzm.AUTO) {
            C1349sg a = arqh.m73304a((Context) getActivity());
            a.mo15905b((int) C0126R.string.smartdevice_reverify_title);
            a.mo15912d(C0126R.string.smartdevice_reverify_body);
            a.mo15906b((int) C0126R.string.common_try_again, asaj);
            a.mo15892a((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null);
            this.f88614k = a.mo15904b();
        } else {
            C1349sg a2 = arqh.m73304a((Context) getActivity());
            a2.mo15912d(C0126R.string.smartdevice_reverify_body_auto);
            a2.mo15906b((int) C0126R.string.common_got_it, asaj);
            this.f88614k = a2.mo15904b();
        }
        this.f88614k.show();
    }
}
