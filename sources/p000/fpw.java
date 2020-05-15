package p000;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* renamed from: fpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fpw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ fpy f17113a;

    public fpw(fpy fpy) {
        this.f17113a = fpy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0269 A[SYNTHETIC] */
    public final void run() {
        svf svf;
        int i;
        sui sui;
        fpy fpy = this.f17113a;
        if (!fpy.getSupportFragmentManager().isDestroyed()) {
            sug sug = fpy.f41601g;
            svf f = sug.mo26099f(C0126R.string.common_google_settings_account);
            if (f == null) {
                f = sug.mo26098e(C0126R.string.common_google_settings_account);
            }
            svf f2 = sug.mo26099f(C0126R.string.common_google_settings_services);
            if (f2 == null) {
                f2 = sug.mo26098e(C0126R.string.common_google_settings_services);
            }
            svf f3 = sug.mo26099f(C0126R.string.common_google_settings_developer);
            if (f3 == null) {
                f3 = sug.mo26098e(C0126R.string.common_google_settings_developer);
            }
            svf f4 = sug.mo26099f(C0126R.string.common_google_settings_internal);
            if (f4 == null) {
                f4 = sug.mo26098e(C0126R.string.common_google_settings_internal);
            }
            boolean z = true;
            fpy.mo11120a(1, f);
            fpy.mo11120a(0, f2);
            fpy.mo11120a(3, f3);
            int i2 = 2;
            if (cdlk.m133967b()) {
                fpy.mo11120a(2, f4);
            }
            fpy.mo11119a(4, (int) C0126R.string.common_google_settings_account_services);
            fpy.mo11119a(5, (int) C0126R.string.common_google_settings_data_and_messaging);
            fpy.mo11119a(6, (int) C0126R.string.common_google_settings_device_connections);
            fpy.mo11119a(7, (int) C0126R.string.common_google_settings_set_up_and_restore);
            fpy.mo11119a(8, (int) C0126R.string.common_google_settings_autofill);
            cdlk.m133967b();
            int i3 = 0;
            while (i3 < fpy.f17117d.size()) {
                Parcel parcel = (Parcel) fpy.f17117d.get(i3);
                parcel.setDataPosition(0);
                GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) GoogleSettingsItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                int i4 = googleSettingsItem.f29957c;
                if (i4 == i2) {
                    fpy.f17115b |= googleSettingsItem.f29962h;
                }
                if (adyl.m51425a(googleSettingsItem, fpy, z) && !fpy.getResources().getString(C0126R.string.primes_debug).equals(googleSettingsItem.f29958d) && (svf = (svf) fpy.f17116c.get(Integer.valueOf(i4))) != null) {
                    switch (googleSettingsItem.f29969o) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        case 10:
                            i = 11;
                            break;
                        case 11:
                            i = 12;
                            break;
                        case 12:
                            i = 13;
                            break;
                        case 13:
                            i = 14;
                            break;
                        case 14:
                            i = 15;
                            break;
                        case 15:
                            i = 16;
                            break;
                        case 16:
                            i = 17;
                            break;
                        case 17:
                            i = 18;
                            break;
                        case 18:
                            i = 19;
                            break;
                        case 19:
                            i = 20;
                            break;
                        case 20:
                            i = 21;
                            break;
                        case 21:
                            i = 22;
                            break;
                        case 22:
                            i = 23;
                            break;
                        case 23:
                            i = 24;
                            break;
                        case 24:
                            i = 25;
                            break;
                        case 25:
                            i = 26;
                            break;
                        case 26:
                            i = 27;
                            break;
                        case 27:
                            i = 28;
                            break;
                        case 28:
                            i = 29;
                            break;
                        case 29:
                            i = 30;
                            break;
                        case 30:
                            i = 31;
                            break;
                        case 31:
                            i = 32;
                            break;
                        case 32:
                            i = 33;
                            break;
                        case 33:
                            i = 34;
                            break;
                        case 34:
                            i = 35;
                            break;
                        case 35:
                            i = 36;
                            break;
                        case 36:
                            i = 37;
                            break;
                        case FelicaException.TYPE_NOT_CLOSED:
                            i = 38;
                            break;
                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                            i = 39;
                            break;
                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                            i = 40;
                            break;
                        case FelicaException.TYPE_PUSH_FAILED:
                            i = 41;
                            break;
                        case 41:
                            i = 42;
                            break;
                        case FelicaException.TYPE_ALREADY_ACTIVATED:
                            i = 43;
                            break;
                        case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                            i = 44;
                            break;
                        case FelicaException.TYPE_RESET_FAILED:
                            i = 45;
                            break;
                        case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                            i = 46;
                            break;
                        case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                            i = 47;
                            break;
                        case 47:
                            i = 48;
                            break;
                        case 48:
                            i = 49;
                            break;
                        case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                            i = 50;
                            break;
                        case 50:
                            i = 51;
                            break;
                        case 51:
                            i = 52;
                            break;
                        case 52:
                            i = 53;
                            break;
                        case 53:
                            i = 54;
                            break;
                        case 54:
                            i = 55;
                            break;
                        case 55:
                            i = 56;
                            break;
                        case FelicaException.TYPE_ACTIVATE_FAILED:
                            i = 57;
                            break;
                        case 57:
                            i = 58;
                            break;
                        case FelicaException.TYPE_OFFLINE_CANCELED:
                            i = 59;
                            break;
                        case FelicaException.TYPE_NOW_EXECUTING_FALP:
                            i = 60;
                            break;
                        case FelicaException.TYPE_MFC_NOT_FOUND:
                            i = 61;
                            break;
                        case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            i = 62;
                            break;
                        case 62:
                            i = 63;
                            break;
                        case 63:
                            i = 64;
                            break;
                        case 64:
                            i = 65;
                            break;
                        case KeyInformation.AES128_DES56:
                            i = 66;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    Intent intent = googleSettingsItem.f29956b;
                    String str = googleSettingsItem.f29958d;
                    String str2 = googleSettingsItem.f29963i;
                    if (i == 0) {
                        i = 1;
                    }
                    int i5 = svf.f45210e;
                    if (fpy.f17118e.mo15646f(i5) != null) {
                        if (cdlk.f181194a.mo6606a().mo77862d()) {
                            if (!fpy.mo24060b(intent)) {
                                String valueOf = String.valueOf(intent);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                                sb.append("Intent does not resolve: ");
                                sb.append(valueOf);
                                Log.w("GoogleSettingsActivity", sb.toString());
                                sui = null;
                            } else {
                                GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(intent, svf.f45210e, str, i);
                                googleSettingsItem2.f29963i = str2;
                                ((List) fpy.f17118e.mo15646f(i5)).add(googleSettingsItem2);
                                sui = null;
                            }
                            if (sui == null) {
                                sui.mo26104a(googleSettingsItem.f29964j);
                                int i6 = googleSettingsItem.f29959e;
                                if (i6 > 0) {
                                    sui.mo26086b(i6);
                                }
                            }
                        } else {
                            svf = (svf) fpy.f17116c.get(0);
                        }
                    }
                    if (fpy.mo24060b(intent)) {
                        sui = qkh.m32282b(fpy);
                        sui.mo26085a(str);
                        sui.mo26100a(intent);
                        sui.mo26105b(str2);
                        if (!svf.mo26151b(sui)) {
                            svf.mo26149a(sui);
                        }
                    } else {
                        sui = null;
                    }
                    if (sui == null) {
                    }
                }
                i3++;
                z = true;
                i2 = 2;
            }
            fpy.mo11121b(4, C0126R.string.common_google_settings_account_services);
            fpy.mo11121b(5, C0126R.string.common_google_settings_data_and_messaging);
            fpy.mo11121b(6, C0126R.string.common_google_settings_device_connections);
            fpy.mo11121b(7, C0126R.string.common_google_settings_set_up_and_restore);
            fpy.mo11121b(8, C0126R.string.common_google_settings_autofill);
            fpy.f17117d.clear();
            fpy.f17114f = null;
            return;
        }
        for (int i7 = 0; i7 < fpy.f17117d.size(); i7++) {
            ((Parcel) fpy.f17117d.get(i7)).recycle();
        }
        fpy.f17117d.clear();
    }
}
