package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: soy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class soy {
    /* renamed from: a */
    private static int m35780a(boolean z) {
        return z ? 2 : 3;
    }

    /* renamed from: a */
    public static boci m35781a(Context context) {
        boolean z;
        bxvd da = boci.f132549i.mo74144da();
        ContentResolver contentResolver = context.getContentResolver();
        String string = Settings.Secure.getString(contentResolver, "enabled_accessibility_services");
        boolean z2 = true;
        if (!TextUtils.isEmpty(string)) {
            String[] split = string.split(":");
            for (String str : split) {
                if (str.startsWith("com.google.") || str.startsWith("com.googlecode.")) {
                    if (str.endsWith("TalkBackService")) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boci boci = (boci) da.f164949b;
                        boci.f132552b = 1;
                        boci.f132551a |= 1;
                    } else if (str.endsWith("BrailleBackService")) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boci boci2 = (boci) da.f164949b;
                        boci2.f132553c = 1;
                        boci2.f132551a |= 2;
                    } else if (str.endsWith("SwitchAccessService") || str.endsWith("SwitchControlService")) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boci boci3 = (boci) da.f164949b;
                        boci3.f132554d = 1;
                        boci3.f132551a |= 4;
                    } else if (str.endsWith("JustSpeakService") || str.endsWith("VoiceAccessService")) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boci boci4 = (boci) da.f164949b;
                        boci4.f132555e = 1;
                        boci4.f132551a |= 8;
                    }
                }
            }
        }
        try {
            if (Settings.System.getFloat(contentResolver, "font_scale") > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int a = m35780a(z);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boci boci5 = (boci) da.f164949b;
            boci5.f132556f = a - 1;
            boci5.f132551a |= 16;
        } catch (Settings.SettingNotFoundException e) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boci boci6 = (boci) da.f164949b;
            boci6.f132556f = 0;
            boci6.f132551a |= 16;
        }
        try {
            int a2 = m35780a(Settings.Secure.getInt(contentResolver, "accessibility_display_magnification_enabled") == 1);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boci boci7 = (boci) da.f164949b;
            boci7.f132557g = a2 - 1;
            boci7.f132551a |= 32;
        } catch (Settings.SettingNotFoundException e2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boci boci8 = (boci) da.f164949b;
            boci8.f132557g = 0;
            boci8.f132551a |= 32;
        }
        try {
            if (Settings.Secure.getInt(contentResolver, "high_text_contrast_enabled") != 1) {
                z2 = false;
            }
            int a3 = m35780a(z2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boci boci9 = (boci) da.f164949b;
            boci9.f132558h = a3 - 1;
            boci9.f132551a |= 64;
        } catch (Settings.SettingNotFoundException e3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boci boci10 = (boci) da.f164949b;
            boci10.f132558h = 0;
            boci10.f132551a |= 64;
        }
        return (boci) da.mo74062i();
    }
}
