package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: xvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvo extends DialogFragment implements xvs {

    /* renamed from: d */
    private static xvm f53224d;

    /* renamed from: e */
    private static xvn f53225e;

    /* renamed from: o */
    private static final sek f53226o = new sek(new String[]{"FingerprintDialogFragment"}, (short[]) null);

    /* renamed from: a */
    public xwn f53227a;

    /* renamed from: b */
    public xwj f53228b;

    /* renamed from: c */
    public int f53229c;

    /* renamed from: f */
    private Button f53230f;

    /* renamed from: g */
    private Button f53231g;

    /* renamed from: h */
    private View f53232h;

    /* renamed from: i */
    private ImageView f53233i;

    /* renamed from: j */
    private TextView f53234j;

    /* renamed from: k */
    private TextView f53235k;

    /* renamed from: l */
    private Activity f53236l;

    /* renamed from: m */
    private xvt f53237m;

    /* renamed from: n */
    private String f53238n;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static void m43485a(String str) {
        f53224d = new xvm();
        xvn xvn = new xvn();
        f53225e = xvn;
        xvm xvm = f53224d;
        sdo.m34966a((Object) str, (Object) "Caller name must be not null");
        f53224d = xvm;
        f53225e = xvn;
        xvo xvo = new xvo();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("CALLER_NAME", str);
        bundle.putInt("STAGE", 1);
        xvo.setArguments(bundle);
    }

    /* renamed from: b */
    private final void m43486b(String str) {
        this.f53233i.setVisibility(8);
        this.f53234j.setVisibility(8);
        this.f53235k.setText(str);
        this.f53235k.setTextAppearance(2132018414);
        this.f53230f.setText((int) C0126R.string.common_cancel);
        this.f53231g.setText((int) C0126R.string.common_skip_fingerprint);
        this.f53232h.setVisibility(0);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10) {
            return;
        }
        if (i2 != -1) {
            f53226o.mo25418e("Lock screen credential verification failed", new Object[0]);
            xag xag = xag.TYPE_RESERVED_DO_NOT_USE;
            throw null;
        }
        xag xag2 = xag.TYPE_RESERVED_DO_NOT_USE;
        throw null;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f53236l = getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setStyle(0, C0126R.style.fingerprintDialog);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawableResource(C0126R.C0127drawable.fingerprint_dialog_background);
        this.f53238n = getArguments().getCharSequence("CALLER_NAME").toString();
        int i = getArguments().getInt("STAGE");
        int i2 = 2;
        boolean z = true;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Invalid enum value ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f53229c = i2;
        TextView textView = (TextView) getDialog().findViewById(16908310);
        if (textView != null) {
            textView.setText(getResources().getString(C0126R.string.verify_your_identity_title));
            textView.setGravity(17);
            textView.setTextAlignment(4);
        } else {
            getDialog().setTitle(getResources().getString(C0126R.string.verify_your_identity_title));
        }
        getDialog().setCanceledOnTouchOutside(false);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fingerprint_dialog_container, viewGroup, false);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.cancel_button);
        this.f53230f = button;
        button.setOnClickListener(new xvk(this));
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.use_backup_button);
        this.f53231g = button2;
        button2.setOnClickListener(new xvl(this));
        this.f53232h = inflate.findViewById(C0126R.C0129id.fingerprint_container);
        this.f53233i = (ImageView) inflate.findViewById(C0126R.C0129id.fingerprint_icon);
        this.f53234j = (TextView) inflate.findViewById(C0126R.C0129id.fingerprint_status);
        this.f53235k = (TextView) inflate.findViewById(C0126R.C0129id.fingerprint_description);
        boolean isEnabled = ((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled();
        Activity activity = this.f53236l;
        xvt xvt = new xvt(activity.getApplicationContext(), this.f53233i, this.f53234j, this.f53230f, this.f53231g, isEnabled, this);
        this.f53237m = xvt;
        if (!xvt.mo30165a()) {
            m43486b(String.format(this.f53236l.getString(C0126R.string.verify_your_identity_description), this.f53238n));
        } else if (!this.f53237m.mo30166b()) {
            m43486b(String.format(this.f53236l.getString(C0126R.string.fingerprint_no_imprints_description), this.f53238n));
        } else {
            if (this.f53229c != 1) {
                z = false;
            }
            sdo.m34974b(z);
            xag xag = xag.TYPE_RESERVED_DO_NOT_USE;
            throw null;
        }
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f53236l.finish();
    }

    public final void onPause() {
        super.onPause();
        this.f53237m.mo30167c();
    }

    public final void onResume() {
        super.onResume();
        if (this.f53229c == 1) {
            xvt xvt = this.f53237m;
            if (xvt.mo30165a() && xvt.mo30166b()) {
                xvt.f53248f = new CancellationSignal();
                ((FingerprintManager) xvt.f53244b.getSystemService("fingerprint")).authenticate(null, xvt.f53248f, 0, xvt, null);
                xvt.f53245c.setImageResource(C0126R.C0127drawable.ic_fingerprint_googblue600_48);
                return;
            }
            xvt.f53242g.mo25418e("Fingerprint authentication is not available", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo9306a() {
        this.f53229c = 2;
        sdo.m34974b(true);
        xag xag = xag.TYPE_RESERVED_DO_NOT_USE;
        throw null;
    }
}
