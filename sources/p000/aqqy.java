package p000;

import android.content.Intent;

/* renamed from: aqqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqy {
    /* renamed from: a */
    public static Intent m72007a(Intent intent, String str, String str2) {
        aqqx aqqx = new aqqx();
        aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.CALLING_PACKAGE", str2);
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID")) {
            aqqx.mo48091a(intent.getIntExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 0));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.CARDS")) {
            aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.CARDS", intent.getExtras().getIntArray("com.google.android.gms.people.smart_profile.CARDS"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY")) {
            aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY", intent.getExtras().getIntArray("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY"));
        }
        String valueOf = String.valueOf(str);
        aqqx.mo48092a(valueOf.length() == 0 ? new String("g:") : "g:".concat(valueOf));
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID")) {
            aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID", intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME")) {
            aqqx.mo48093b(intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.THEME_COLOR")) {
            aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR", intent.getStringExtra("com.google.android.gms.people.smart_profile.THEME_COLOR"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT")) {
            aqqx.f86636a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", intent.getIntExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", 0));
        }
        return aqqx.f86636a;
    }
}
