package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: adty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adty extends adul implements adtq {

    /* renamed from: f */
    private static final bnic f62733f = bnpf.m110045a(btur.SETTINGS_NEXT_STEPS, btur.SETTINGS_NEXT_STEPS_SHARED);

    /* renamed from: a */
    public adtv f62734a;

    /* renamed from: b */
    public adug f62735b;

    /* renamed from: c */
    public biyp f62736c;

    /* renamed from: d */
    public ProgressBar f62737d;

    /* renamed from: e */
    public btur f62738e;

    /* renamed from: a */
    public static adty m51203a(btur btur) {
        adty adty = new adty();
        if (ceqw.m138011b()) {
            bmxy.m108591a(f62733f.contains(btur), "Unsupported fragment id: %s", btur.f150618aY);
            Bundle bundle = new Bundle(1);
            bundle.putInt("fragment-id", btur.f150618aY);
            adty.setArguments(bundle);
        }
        return adty;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.chimera.Activity, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1 || (intent != null && intent.getBooleanExtra("close_original_activity", false))) {
            Activity activity = getActivity();
            bmxy.m108581a(activity);
            if (i2 == -1) {
                spn.m35856a((Context) activity, "com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", false);
            }
            activity.setResult(0, intent);
            activity.finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        btur btur;
        super.onCreate(bundle);
        if (ceqw.m138011b()) {
            btur = btur.m117163a(getArguments().getInt("fragment-id", btur.SETTINGS_NEXT_STEPS.f150618aY));
        } else {
            btur = btur.SETTINGS_NEXT_STEPS;
        }
        this.f62738e = btur;
        this.f62734a = (adtv) aduo.m51219a(getActivity()).mo3444a(adtv.class);
        adun c = mo33833c();
        bmxy.m108581a(c);
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        this.f62735b = (adug) c.mo33834a(activity).mo3444a(adug.class);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!ceqw.f183329a.mo6606a().mo79656i()) {
            i = C0126R.C0128layout.next_steps;
        } else {
            i = C0126R.C0128layout.next_steps_v2;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        biyp biyp = ((biyn) glifLayout.mo71342a(biyn.class)).f122314f;
        this.f62736c = biyp;
        biyp.f122336f = new adtw(this);
        this.f62737d = (ProgressBar) glifLayout.findViewById(C0126R.C0129id.progress_bar);
        this.f62735b.f62761d.mo2445a(this, new adtx(this));
        this.f62735b.mo33829a(getActivity(), this.f62734a.f62729e);
        return glifLayout;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f62736c = null;
        this.f62737d = null;
    }

    /* renamed from: a */
    public final void mo33812a() {
        this.f62735b.mo33829a(getActivity(), this.f62734a.f62729e);
    }
}
