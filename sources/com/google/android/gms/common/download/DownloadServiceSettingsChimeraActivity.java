package com.google.android.gms.common.download;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.ListView;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadServiceSettingsChimeraActivity extends deu {

    /* renamed from: b */
    public static final srn f30190b = srn.m36126a("DownloadSvcSettingsActv", sgj.DOWNLOAD);

    /* renamed from: c */
    static final DownloadDetails f30191c;

    /* renamed from: d */
    static final DownloadDetails f30192d;

    /* renamed from: e */
    public static final String[] f30193e = {"_id", "text1", "text2"};

    /* renamed from: f */
    public final Runnable f30194f = new rxy(this);

    /* renamed from: g */
    public Handler f30195g;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DownloadServiceSettingsOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.common.download.DOWNLOAD_SETTINGS"), 2, "Download Service debug", 24);
            googleSettingsItem.f29961g = true;
            googleSettingsItem.f29962h = cdev.f180623a.mo6606a().mo77376i();
            return googleSettingsItem;
        }
    }

    static {
        rxw rxw = new rxw("__google_logo.jpg", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", 5969, "1737d3dfb411c07b86ed8bd30f5987a4dc397cc1");
        rxw.f43837e = "google_logo";
        f30191c = rxw.mo25246a();
        rxw rxw2 = new rxw("__world_cup_day_1.jpg", "https://www.google.com/logos/doodles/2018/world-cup-2018-day-1-5741876039647232-2x.png", 760148, "df0d9c53a3fda7049209d47d9887c47e60d19ea4");
        rxw2.f43837e = "worldcup_day_1";
        f30192d = rxw2.mo25246a();
    }

    /* renamed from: e */
    public static DownloadDetails m22572e() {
        return !cdey.f180635a.mo77378b().mo77379a() ? f30191c : f30192d;
    }

    /* renamed from: g */
    public final void mo17783g() {
        new rya(this).start();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = new ListView(this);
        listView.setId(16908298);
        setContentView(listView);
        setTitle("Download Service debug");
        this.f30195g = new adzt();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        ryc ryc = new ryc(this);
        menu.add(0, 1, 0, "Start DownloadService Now").setOnMenuItemClickListener(ryc);
        menu.add(0, 2, 0, "Enable file").setOnMenuItemClickListener(ryc);
        menu.add(0, 3, 0, "Disable file").setOnMenuItemClickListener(ryc);
        menu.add(0, 4, 0, "View file").setOnMenuItemClickListener(ryc);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        mo17783g();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f30195g.removeCallbacks(this.f30194f);
    }
}
