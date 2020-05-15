package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.ocr.RecognitionScreen;
import com.google.android.gms.ocr.credit.base.CreditCardResult;
import com.google.android.material.button.MaterialButton;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aksn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aksn extends Activity implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnCancelListener, akqa, akps, bjwu {

    /* renamed from: r */
    private static ImageLoader f72645r;

    /* renamed from: a */
    protected akua f72646a;

    /* renamed from: b */
    protected int f72647b = 0;

    /* renamed from: c */
    protected boolean f72648c;

    /* renamed from: d */
    protected bjww f72649d = new bjwz();

    /* renamed from: e */
    protected MaterialButton f72650e;

    /* renamed from: f */
    protected Button f72651f;

    /* renamed from: g */
    protected FifeNetworkImageView f72652g;

    /* renamed from: h */
    protected LinearLayout f72653h;

    /* renamed from: i */
    protected LinearLayout f72654i;

    /* renamed from: j */
    protected FrameLayout f72655j;

    /* renamed from: k */
    protected aksg f72656k;

    /* renamed from: l */
    private aksj f72657l;

    /* renamed from: m */
    private boolean f72658m;

    /* renamed from: n */
    private ArrayList f72659n = new ArrayList(2);

    /* renamed from: o */
    private boolean f72660o = false;

    /* renamed from: p */
    private TextView f72661p;

    /* renamed from: q */
    private TextView f72662q;

    /* renamed from: s */
    private AlertDialog f72663s;

    /* renamed from: t */
    private TextView f72664t;

    /* renamed from: u */
    private ImageView f72665u;

    /* renamed from: a */
    private static synchronized ImageLoader m60362a(Context context) {
        ImageLoader imageLoader;
        synchronized (aksn.class) {
            if (f72645r == null) {
                f72645r = new ImageLoader(bjtx.m104621b(context), new bjvc(context, ((Integer) bjwd.f123463c.mo54082a()).intValue()));
            }
            imageLoader = f72645r;
        }
        return imageLoader;
    }

    /* renamed from: b */
    private final void m60365b(int i) {
        RecognitionScreen a = mo39807a(this.f72647b);
        RecognitionScreen a2 = mo39807a(i);
        RecognitionScreen a3 = mo39807a(m60366c(i));
        if (a != a2) {
            int i2 = a.f81257c;
            if (i2 == 1) {
                this.f72656k.mo39688e();
                this.f72653h.setVisibility(8);
            } else if (i2 == 2) {
                this.f72654i.setVisibility(8);
            } else {
                throw new IllegalStateException(String.format("Screen type is not recognized: %s", Integer.valueOf(i2)));
            }
        }
        m60364a(false);
        m60368e();
        this.f72661p.setText(a2.f81255a);
        this.f72662q.setText(a2.f81256b);
        this.f72651f.setText(a2.f81259e);
        this.f72650e.setText(a3.f81258d);
        int i3 = a2.f81257c;
        if (i3 == 1) {
            aksg aksg = this.f72656k;
            if (aksg.f72402a.f72502r == 4) {
                m60364a(true);
            } else {
                aksg.mo39687d();
            }
            this.f72653h.setVisibility(0);
        } else if (i3 == 2) {
            this.f72652g.mo71889a(a2.f81260f, m60362a(getApplicationContext()), true);
            this.f72654i.setVisibility(0);
            m60364a(true);
        } else {
            throw new IllegalStateException(String.format("Screen type is not recognized: %s", Integer.valueOf(i3)));
        }
        this.f72647b = i;
    }

    /* renamed from: c */
    private final int m60366c(int i) {
        return (i + 1) % this.f72659n.size();
    }

    /* renamed from: d */
    private final void m60367d() {
        int i;
        if (this.f72660o) {
            i = m60366c(this.f72647b);
        } else {
            i = this.f72647b;
        }
        int i2 = mo39807a(i).f81257c;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalArgumentException(String.format("Screen type is not recognized: %s", Integer.valueOf(i2)));
            } else if (!this.f72649d.mo65605c()) {
                if (i2 == 1) {
                    return;
                }
                if (i2 == 2) {
                    AlertDialog create = new AlertDialog.Builder(this).setTitle((int) C0126R.string.wallet_uic_nfc_enable_title).setMessage((int) C0126R.string.wallet_uic_nfc_popup_disabled_information).setPositiveButton((int) C0126R.string.wallet_uic_nfc_enable_button, this).setOnCancelListener(this).create();
                    this.f72663s = create;
                    create.show();
                    return;
                }
                throw new IllegalArgumentException(String.format("Screen type is not recognized: %s", Integer.valueOf(i2)));
            }
        }
        this.f72660o = false;
        m60365b(i);
    }

    /* renamed from: e */
    private final void m60368e() {
        this.f72664t.setText("");
        this.f72664t.setVisibility(4);
    }

    /* renamed from: bC */
    public final void mo39697bC() {
        if (this.f72648c) {
            m60364a(true);
        }
    }

    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof aksg) {
            aksg aksg = (aksg) fragment;
            this.f72657l.mo39806a(aksg);
            aksg.f72411j = this;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f72660o) {
            this.f72660o = false;
            m60365b(this.f72647b);
            return;
        }
        mo39809a((Intent) null, 0);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            startActivity(new Intent("android.settings.NFC_SETTINGS"));
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        RecognitionScreen recognitionScreen;
        aksj aksj = new aksj(this, getIntent().getExtras());
        this.f72657l = aksj;
        this.f72646a = aksj.f72629j;
        boolean booleanExtra = getIntent().getBooleanExtra("FULLSCREEN_MODE", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("USE_BRANDED_UI", true);
        this.f72658m = booleanExtra2;
        int i = 2132018698;
        int i2 = 0;
        if (booleanExtra2) {
            boolean booleanExtra3 = getIntent().getBooleanExtra("NIGHT_MODE", false);
            if (booleanExtra) {
                i = booleanExtra3 ? 2132018696 : 2132018695;
            } else if (booleanExtra3) {
                i = 2132018699;
            }
            setTheme(i);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0126R.attr.brandedThemeOverlay});
            int resourceId = obtainStyledAttributes.getResourceId(0, C0126R.style.Theme_Overlay_Branded_Light);
            obtainStyledAttributes.recycle();
            getTheme().applyStyle(resourceId, true);
        } else {
            if (booleanExtra) {
                i = 2132017405;
            }
            setTheme(i);
        }
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("LOCK_TO_PORTRAIT_MODE", true)) {
            int i3 = Build.VERSION.SDK_INT;
            setRequestedOrientation(1);
            if (getResources().getConfiguration().orientation != 1) {
                Toast.makeText(this, (int) C0126R.string.ocr_rotate_device, 1).show();
                return;
            }
        }
        getWindow().addFlags(8192);
        Bundle bundleExtra = getIntent().getBundleExtra("com.google.android.gms.ocr.RECOGNITION");
        if (bundleExtra != null) {
            ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS");
            if (parcelableArrayList.isEmpty()) {
                int[] intArray = bundleExtra.getIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES");
                parcelableArrayList = new ArrayList();
                for (int i4 : intArray) {
                    if (i4 == 1) {
                        akpk a = RecognitionScreen.m67680a();
                        a.mo39661d(getString(C0126R.string.ocr_cc_add_a_card));
                        a.mo39659b(getString(C0126R.string.ocr_cc_scan_card_details));
                        a.mo39662e(getString(C0126R.string.ocr_use_this_screen_text));
                        a.mo39658a(getString(C0126R.string.ocr_nfc_fallback_text));
                        a.mo39657a(1);
                        recognitionScreen = a.mo39656a();
                    } else if (i4 == 2) {
                        akpk a2 = RecognitionScreen.m67680a();
                        a2.mo39661d(getString(C0126R.string.nfc_cc_add_a_card));
                        a2.mo39659b(getString(C0126R.string.nfc_cc_tap_card_details));
                        a2.mo39660c((String) bjwe.f123491l.mo54082a());
                        a2.mo39662e(getString(C0126R.string.nfc_use_this_screen_text));
                        a2.mo39658a(getString(C0126R.string.ocr_nfc_fallback_text));
                        a2.mo39657a(2);
                        recognitionScreen = a2.mo39656a();
                    } else {
                        throw new IllegalArgumentException(String.format("Screen type is not recognized: %s", Integer.valueOf(i4)));
                    }
                    parcelableArrayList.add(recognitionScreen);
                }
            }
            this.f72659n = parcelableArrayList;
            if (!parcelableArrayList.isEmpty()) {
                this.f72648c = true;
                ArrayList arrayList = this.f72659n;
                int size = arrayList.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    int i5 = i2 + 1;
                    if (((RecognitionScreen) arrayList.get(i2)).f81257c == 2) {
                        this.f72649d = new bjwy(this, this);
                        break;
                    }
                    i2 = i5;
                }
            } else {
                mo39809a((Intent) null, 0);
                return;
            }
        }
        if (!this.f72658m && !this.f72648c) {
            str = getString(C0126R.string.ocr_cc_scan_card_details);
        } else {
            str = "";
        }
        setTitle(str);
        aksg aksg = (aksg) getSupportFragmentManager().findFragmentByTag("CreditCardFragment");
        this.f72656k = aksg;
        if (bundle == null || aksg == null) {
            aksg aksg2 = new aksg();
            this.f72656k = aksg2;
            aksg2.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(16908290, this.f72656k, "CreditCardFragment").commit();
        }
        if (bundle != null) {
            this.f72647b = bundle.getInt("currentScreenIndex");
            this.f72660o = bundle.getBoolean("tryingToShowNextScreen");
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        if (this.f72649d.mo65605c() && !this.f72649d.mo65606d()) {
            m60364a(false);
            this.f72649d.mo65603a(intent);
        }
    }

    public final void onPause() {
        if (this.f72648c) {
            this.f72649d.mo65604b();
            this.f72656k.mo39688e();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        if (this.f72648c) {
            this.f72649d.mo65602a();
            AlertDialog alertDialog = this.f72663s;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentScreenIndex", this.f72647b);
        bundle.putBoolean("tryingToShowNextScreen", this.f72660o);
    }

    /* renamed from: c */
    public final void mo39698c() {
        mo39809a((Intent) null, 10003);
    }

    /* renamed from: a */
    private final void m60363a(String str) {
        this.f72664t.setText(str);
        this.f72664t.setVisibility(0);
    }

    public void onClick(View view) {
        if (view == this.f72651f) {
            if (this.f72648c) {
                mo39809a((Intent) null, 10007);
                return;
            }
            setResult(10007);
            finish();
        } else if (view == this.f72650e) {
            this.f72660o = true;
            m60367d();
        }
    }

    /* renamed from: a */
    private final void m60364a(boolean z) {
        int i;
        if (this.f72650e.getVisibility() == 0) {
            this.f72650e.setEnabled(z);
        }
        Button button = this.f72651f;
        int i2 = 0;
        if (!z) {
            i = 4;
        } else {
            i = 0;
        }
        button.setVisibility(i);
        this.f72651f.setEnabled(z);
        this.f72665u.setVisibility(i);
        FrameLayout frameLayout = this.f72655j;
        if (z) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
    }

    /* renamed from: a */
    public final int mo39678a() {
        if (!this.f72658m) {
            return getResources().getColor(C0126R.color.google_black);
        }
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0126R.attr.colorPrimary});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final akpz mo39694a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (this.f72648c) {
            layoutInflater.inflate((int) C0126R.C0128layout.credit_card_activity, viewGroup, true);
            this.f72665u = (ImageView) viewGroup.findViewById(C0126R.C0129id.GooglePayLogo);
            this.f72661p = (TextView) viewGroup.findViewById(C0126R.C0129id.credit_card_title);
            this.f72662q = (TextView) viewGroup.findViewById(C0126R.C0129id.credit_card_subtext);
            this.f72664t = (TextView) viewGroup.findViewById(C0126R.C0129id.credit_card_message);
            this.f72655j = (FrameLayout) viewGroup.findViewById(C0126R.C0129id.progress_spinner_container);
            this.f72653h = (LinearLayout) viewGroup.findViewById(C0126R.C0129id.ocr_preview_layout);
            this.f72654i = (LinearLayout) viewGroup.findViewById(C0126R.C0129id.instruction_layout);
            FifeNetworkImageView fifeNetworkImageView = (FifeNetworkImageView) viewGroup.findViewById(C0126R.C0129id.instruction_image);
            this.f72652g = fifeNetworkImageView;
            fifeNetworkImageView.mo71888a();
            this.f72650e = (MaterialButton) viewGroup.findViewById(C0126R.C0129id.switch_option_button);
            if (this.f72659n.size() > 1) {
                this.f72650e.setOnClickListener(this);
                this.f72650e.setVisibility(0);
            } else {
                this.f72650e.setVisibility(8);
            }
        } else {
            if (!this.f72658m) {
                i = C0126R.C0128layout.legacy_ocr_card_detector;
            } else {
                i = C0126R.C0128layout.ocr_card_detector;
            }
            layoutInflater.inflate(i, viewGroup, true);
        }
        Button button = (Button) viewGroup.findViewById(C0126R.C0129id.ocrSkipScanButton);
        this.f72651f = button;
        button.requestFocus();
        this.f72651f.setOnClickListener(this);
        return new aksm((ViewGroup) viewGroup.findViewById(C0126R.C0129id.ocrRegionOfInterest));
    }

    /* renamed from: b */
    public final void mo39696b() {
        if (this.f72648c) {
            if (mo39807a(this.f72647b).f81257c != 1) {
                this.f72656k.mo39683a(true);
                this.f72656k.mo39688e();
            }
            m60367d();
            return;
        }
        this.f72656k.mo39687d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RecognitionScreen mo39807a(int i) {
        return (RecognitionScreen) this.f72659n.get(i);
    }

    /* renamed from: a */
    public final void mo39808a(int i, bjws bjws, long j) {
        switch (i) {
            case 1:
                m60368e();
                akpa b = CreditCardOcrResult.m67676b();
                b.mo39635d(2);
                b.mo39630a(i);
                if (bjws != null) {
                    if (bjws.mo65594a()) {
                        b.mo39633b(bjws.f123530a);
                    }
                    if (bjws.mo65595b()) {
                        b.mo39632b(bjws.f123531b);
                        b.mo39634c(bjws.f123532c);
                    }
                    if (bjws.mo65596c()) {
                        b.mo39631a(bjws.f123533d);
                    }
                }
                CreditCardOcrResult creditCardOcrResult = b.f72380a;
                Intent intent = new Intent();
                intent.putExtra("CREDIT_CARD_OCR_RESULT", creditCardOcrResult);
                mo39809a(intent, -1);
                break;
            case 2:
                break;
            case 3:
            case 4:
                m60363a(getString(C0126R.string.wallet_uic_nfc_unsupported_error_message));
                break;
            case 5:
                m60363a(getString(C0126R.string.wallet_uic_nfc_transceive_error_message));
                break;
            case 6:
                m60363a(getString(C0126R.string.wallet_uic_nfc_timeout_error_message));
                break;
            case 7:
                m60363a(getString(C0126R.string.wallet_uic_nfc_rate_limit_error_message));
                break;
            default:
                throw new IllegalStateException(String.format("Unknown NFC result code: %s", Integer.valueOf(i)));
        }
        m60364a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39809a(Intent intent, int i) {
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    /* renamed from: a */
    public final void mo39695a(List list) {
        Intent intent = new Intent();
        if (list != null && !list.isEmpty()) {
            if (this.f72648c) {
                CreditCardOcrResult a = aksq.m60380a((CreditCardResult) list.get(0));
                akpa akpa = new akpa(a, a);
                akpa.mo39635d(1);
                akpa.mo39630a(-1);
                intent.putExtra("CREDIT_CARD_OCR_RESULT", akpa.f72380a);
            } else {
                intent.putExtra("CREDIT_CARD_OCR_RESULT", (Parcelable) list.get(0));
            }
        }
        mo39809a(intent, -1);
    }
}
