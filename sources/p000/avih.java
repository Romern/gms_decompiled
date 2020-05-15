package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.udc.p077ui.UdcAuthUrlSpan;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: avih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avih {

    /* renamed from: b */
    private static final srn f93227b = srn.m36124a();

    /* renamed from: a */
    public ArrayList f93228a;

    /* renamed from: c */
    private final avin f93229c;

    public avih() {
        this(null);
    }

    /* renamed from: a */
    public static TextView m78568a(View view, int i) {
        sdo.m34966a(view, "Root view must not be null");
        try {
            TextView textView = (TextView) view.findViewById(i);
            if (textView == null) {
                bnsl bnsl = (bnsl) f93227b.mo68387b();
                bnsl.mo68432a("avih", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Tried setting text, but couldn't find view");
            }
            return textView;
        } catch (ClassCastException e) {
            bnsl bnsl2 = (bnsl) f93227b.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("avih", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Tried setting text, but not on a TextView");
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m78576a(bxsk bxsk) {
        return bxsk == null || (bxsk.f164697a & 2) == 0;
    }

    /* renamed from: b */
    public final void mo51267b(bxsk bxsk) {
        ArrayList arrayList = this.f93228a;
        if (arrayList != null && bxsk != null && (bxsk.f164697a & 1) != 0) {
            arrayList.add(bxsk.f164698b.mo73780k());
        }
    }

    public avih(avin avin) {
        this.f93229c = avin;
    }

    /* renamed from: a */
    private final TextView m78569a(View view, int i, bxsk bxsk, boolean z, String str) {
        TextView a = m78568a(view, i);
        if (a == null) {
            return null;
        }
        mo51265a(a, bxsk, z, str);
        return a;
    }

    /* renamed from: a */
    public static bxxc m78570a(Intent intent, String str, bxxk bxxk) {
        return m78572a(intent.getByteArrayExtra(str), bxxk);
    }

    /* renamed from: a */
    public static bxxc m78571a(Bundle bundle, String str, bxxk bxxk) {
        return m78572a(bundle.getByteArray(str), bxxk);
    }

    /* renamed from: a */
    public static bxxc m78572a(byte[] bArr, bxxk bxxk) {
        if (bArr == null) {
            return null;
        }
        try {
            return (bxxc) bxxk.mo73657a(bArr);
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f93227b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avih", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error unbundling proto");
            return null;
        }
    }

    /* renamed from: a */
    public static void m78573a(Intent intent, String str, bxxc bxxc) {
        intent.putExtra(str, bxxc != null ? bxxc.mo73642k() : null);
    }

    /* renamed from: a */
    public static void m78574a(Bundle bundle, String str, bxxc bxxc) {
        bundle.putByteArray(str, bxxc != null ? bxxc.mo73642k() : null);
    }

    /* renamed from: a */
    public static void m78575a(View view, CharSequence charSequence) {
        Context context = null;
        if (!(view == null || view.getContext() == null)) {
            context = view.getContext().getApplicationContext();
        }
        if (context != null && !TextUtils.isEmpty(charSequence)) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                int i = Build.VERSION.SDK_INT;
                AccessibilityEvent obtain = AccessibilityEvent.obtain((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                obtain.getText().add(charSequence);
                obtain.setEnabled(view.isEnabled());
                obtain.setClassName(view.getClass().getName());
                obtain.setPackageName(context.getPackageName());
                new C1305qq(obtain).mo15795a(view);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    /* renamed from: a */
    public final TextView mo51262a(View view, int i, bxsk bxsk) {
        return m78569a(view, i, bxsk, false, null);
    }

    /* renamed from: a */
    public final NetworkImageView mo51263a(View view, int i, bxsc bxsc, ImageLoader imageLoader) {
        NetworkImageView networkImageView;
        sdo.m34966a(view, "Root view must not be null");
        sdo.m34966a(bxsc, "Image resource must not be null");
        try {
            networkImageView = (NetworkImageView) view.findViewById(i);
        } catch (ClassCastException e) {
            bnsl bnsl = (bnsl) f93227b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avih", "a", 266, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Found view, but not a LoadingImageView");
            networkImageView = null;
        }
        if (networkImageView != null && !bxsc.f164663c.isEmpty()) {
            networkImageView.setImageUrl(bxsc.f164663c, imageLoader);
            networkImageView.setVisibility(0);
            ArrayList arrayList = this.f93228a;
            if (!(arrayList == null || bxsc == null || (bxsc.f164661a & 1) == 0)) {
                arrayList.add(bxsc.f164662b.mo73780k());
            }
            return networkImageView;
        }
        bnsl bnsl2 = (bnsl) f93227b.mo68387b();
        bnsl2.mo68432a("avih", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Tried loading image, but couldn't find view");
        return null;
    }

    /* renamed from: a */
    public final void mo51264a(View view, bxsk bxsk, String str) {
        m78569a(view, C0126R.C0129id.text, bxsk, true, str);
    }

    /* renamed from: a */
    public final void mo51265a(TextView textView, bxsk bxsk, boolean z, String str) {
        if (!m78576a(bxsk) && mo51266a(textView, bxsk.f164699c, z, str)) {
            mo51267b(bxsk);
        }
    }

    /* renamed from: a */
    public final boolean mo51266a(TextView textView, String str, boolean z, String str2) {
        sdo.m34974b(!z ? true : str2 != null);
        Spanned a = avhd.m78503a(str, this.f93229c);
        if (z && !TextUtils.isEmpty(a) && !TextUtils.isEmpty(a)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            UdcAuthUrlSpan[] udcAuthUrlSpanArr = (UdcAuthUrlSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), UdcAuthUrlSpan.class);
            for (UdcAuthUrlSpan udcAuthUrlSpan : udcAuthUrlSpanArr) {
                if (udcAuthUrlSpan.f109398a) {
                    udcAuthUrlSpan.f109399b = str2;
                }
            }
            a = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(a)) {
            bnsl bnsl = (bnsl) f93227b.mo68388c();
            bnsl.mo68432a("avih", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Tried setting text, but text was empty");
            return false;
        }
        if (z && (a instanceof Spanned) && ((ClickableSpan[]) a.getSpans(0, a.length(), ClickableSpan.class)).length > 0) {
            textView.setLinksClickable(true);
            textView.setAutoLinkMask(0);
            if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        textView.setText(a);
        textView.setVisibility(0);
        return true;
    }
}
