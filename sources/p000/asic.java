package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* renamed from: asic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asic {
    /* renamed from: a */
    static int m74159a(Exception exc) {
        if (exc instanceof gil) {
            switch (((gil) exc).f18300a) {
                case 0:
                    return 1;
                case 1:
                    return 208;
                case 2:
                    return 56;
                case 3:
                case 4:
                case 9:
                case 11:
                case 12:
                default:
                    return 32;
                case 5:
                    return 26;
                case 6:
                    return 71;
                case 7:
                    return 11;
                case 8:
                case 10:
                    return 255;
                case 13:
                case 14:
                case 15:
                    return 121;
                case 16:
                    return BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
            }
        } else if (exc instanceof UserRecoverableAuthException) {
            return m74160a(exc.getMessage(), true);
        } else {
            if (exc instanceof IOException) {
                String message = exc.getMessage();
                if (message != null && !message.isEmpty()) {
                    if (message.contains("Could not bind to service")) {
                        return BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE;
                    }
                    int a = m74160a(exc.getMessage(), false);
                    if (a != 255) {
                        return a;
                    }
                }
                return 11;
            } else if (exc instanceof gid) {
                String message2 = exc.getMessage();
                return (message2 == null || message2.isEmpty()) ? ErrorInfo.TYPE_SDU_UNKNOWN : m74160a(exc.getMessage(), false);
            } else if ((exc instanceof AuthenticatorException) || (exc instanceof SecurityException)) {
                return BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE;
            } else {
                if (exc instanceof OperationCanceledException) {
                    return 121;
                }
                if (exc instanceof IllegalStateException) {
                    return BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR;
                }
                return 255;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static int m74160a(String str, boolean z) {
        char c;
        switch (str.hashCode()) {
            case -1185112507:
                if (str.equals("UserCancel")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -605507559:
                if (str.equals("CaptchaRequired")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -279783902:
                if (str.equals("Interrupted")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -262979598:
                if (str.equals("DeviceManagementRequiredOrSyncDisabled")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 120785050:
                if (str.equals("NetworkError")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 314864744:
                if (str.equals("AppDownloadRequired")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 350741825:
                if (str.equals("Timeout")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1001684413:
                if (str.equals("BadAuthentication")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1973990181:
                if (str.equals("NeedPermission")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return 121;
            case 3:
                return 26;
            case 4:
                return 11;
            case 5:
                return 32;
            case 6:
                return 208;
            case 7:
                return BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
            case 8:
                return 71;
            default:
                return !z ? 255 : 32;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0107 A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0108 A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01be A[SYNTHETIC] */
    /* renamed from: a */
    public static void m74161a(Context context, AccountManager accountManager, String str, bxvd bxvd) {
        char c;
        int i;
        bpwd bpwd;
        String a;
        Account[] accountsByType = accountManager.getAccountsByType(str);
        int length = accountsByType.length;
        if (length != 0) {
            for (Account account : accountsByType) {
                bxvd da = bpwc.f139457e.mo74144da();
                bxvd da2 = bpwb.f139452d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpwb bpwb = (bpwb) da2.f164949b;
                bpwb.f139455b = 254;
                bpwb.f139454a |= 1;
                String str2 = account.type;
                int hashCode = str2.hashCode();
                if (hashCode != 816462108) {
                    if (hashCode == 879034182 && str2.equals("com.google")) {
                        c = 0;
                        if (c != 0) {
                            i = c != 1 ? 16 : 2;
                        } else {
                            i = 1;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpwc bpwc = (bpwc) da.f164949b;
                        int i2 = i - 1;
                        bpwc.f139461c = i2;
                        bpwc.f139459a |= 4;
                        int a2 = bpvy.m112338a(i2);
                        if (a2 != 0 && a2 == 16) {
                            String str3 = account.type;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpwc bpwc2 = (bpwc) da.f164949b;
                            str3.getClass();
                            bpwc2.f139459a |= 8;
                            bpwc2.f139462d = str3;
                        }
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpwb bpwb2 = (bpwb) da2.f164949b;
                        bpwb2.f139456c = 1;
                        bpwb2.f139454a |= 2;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("UseCache", true);
                        a = gie.m13190a(context, account.name, "oauth2: email", bundle);
                        try {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpwb bpwb3 = (bpwb) da2.f164949b;
                            bpwb3.f139456c = 8;
                            bpwb3.f139454a |= 2;
                            if (a != null || a.isEmpty()) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpwb bpwb4 = (bpwb) da2.f164949b;
                                bpwb4.f139456c = 13;
                                int i3 = bpwb4.f139454a | 2;
                                bpwb4.f139454a = i3;
                                bpwb4.f139455b = 230;
                                bpwb4.f139454a = i3 | 1;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpwc bpwc3 = (bpwc) da.f164949b;
                                bpwb bpwb5 = (bpwb) da2.mo74062i();
                                bpwb5.getClass();
                                bpwc3.f139460b = bpwb5;
                                bpwc3.f139459a |= 1;
                                bpwc bpwc4 = (bpwc) da.mo74062i();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bpwd = (bpwd) bxvd.f164949b;
                                bpwd bpwd2 = bpwd.f139463b;
                                bpwc4.getClass();
                                if (bpwd.f139465a.mo73666a()) {
                                    bpwd.f139465a = bxvk.m124021a(bpwd.f139465a);
                                }
                                bpwd.f139465a.add(bpwc4);
                            } else {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpwb bpwb6 = (bpwb) da2.f164949b;
                                bpwb6.f139456c = 15;
                                int i4 = bpwb6.f139454a | 2;
                                bpwb6.f139454a = i4;
                                bpwb6.f139455b = 0;
                                bpwb6.f139454a = i4 | 1;
                                if (da.f164950c) {
                                }
                                bpwc bpwc32 = (bpwc) da.f164949b;
                                bpwb bpwb52 = (bpwb) da2.mo74062i();
                                bpwb52.getClass();
                                bpwc32.f139460b = bpwb52;
                                bpwc32.f139459a |= 1;
                                bpwc bpwc42 = (bpwc) da.mo74062i();
                                if (bxvd.f164950c) {
                                }
                                bpwd = (bpwd) bxvd.f164949b;
                                bpwd bpwd22 = bpwd.f139463b;
                                bpwc42.getClass();
                                if (bpwd.f139465a.mo73666a()) {
                                }
                                bpwd.f139465a.add(bpwc42);
                            }
                        } catch (Exception e) {
                            int a3 = m74159a(e);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpwb bpwb7 = (bpwb) da2.f164949b;
                            int i5 = a3 - 1;
                            if (a3 != 0) {
                                bpwb7.f139455b = i5;
                                bpwb7.f139454a |= 1;
                            } else {
                                throw null;
                            }
                        }
                    }
                } else if (str2.equals("cn.google")) {
                    c = 1;
                    if (c != 0) {
                    }
                    if (da.f164950c) {
                    }
                    bpwc bpwc5 = (bpwc) da.f164949b;
                    int i22 = i - 1;
                    bpwc5.f139461c = i22;
                    bpwc5.f139459a |= 4;
                    int a22 = bpvy.m112338a(i22);
                    String str32 = account.type;
                    if (da.f164950c) {
                    }
                    bpwc bpwc22 = (bpwc) da.f164949b;
                    str32.getClass();
                    bpwc22.f139459a |= 8;
                    bpwc22.f139462d = str32;
                    if (da2.f164950c) {
                    }
                    bpwb bpwb22 = (bpwb) da2.f164949b;
                    bpwb22.f139456c = 1;
                    bpwb22.f139454a |= 2;
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("UseCache", true);
                    a = gie.m13190a(context, account.name, "oauth2: email", bundle2);
                    if (da2.f164950c) {
                    }
                    bpwb bpwb32 = (bpwb) da2.f164949b;
                    bpwb32.f139456c = 8;
                    bpwb32.f139454a |= 2;
                    if (a != null) {
                    }
                    if (da2.f164950c) {
                    }
                    bpwb bpwb42 = (bpwb) da2.f164949b;
                    bpwb42.f139456c = 13;
                    int i32 = bpwb42.f139454a | 2;
                    bpwb42.f139454a = i32;
                    bpwb42.f139455b = 230;
                    bpwb42.f139454a = i32 | 1;
                    if (da.f164950c) {
                    }
                    bpwc bpwc322 = (bpwc) da.f164949b;
                    bpwb bpwb522 = (bpwb) da2.mo74062i();
                    bpwb522.getClass();
                    bpwc322.f139460b = bpwb522;
                    bpwc322.f139459a |= 1;
                    bpwc bpwc422 = (bpwc) da.mo74062i();
                    if (bxvd.f164950c) {
                    }
                    bpwd = (bpwd) bxvd.f164949b;
                    bpwd bpwd222 = bpwd.f139463b;
                    bpwc422.getClass();
                    if (bpwd.f139465a.mo73666a()) {
                    }
                    bpwd.f139465a.add(bpwc422);
                }
                c = 65535;
                if (c != 0) {
                }
                if (da.f164950c) {
                }
                bpwc bpwc52 = (bpwc) da.f164949b;
                int i222 = i - 1;
                bpwc52.f139461c = i222;
                bpwc52.f139459a |= 4;
                int a222 = bpvy.m112338a(i222);
                String str322 = account.type;
                if (da.f164950c) {
                }
                bpwc bpwc222 = (bpwc) da.f164949b;
                str322.getClass();
                bpwc222.f139459a |= 8;
                bpwc222.f139462d = str322;
                if (da2.f164950c) {
                }
                bpwb bpwb222 = (bpwb) da2.f164949b;
                bpwb222.f139456c = 1;
                bpwb222.f139454a |= 2;
                try {
                    Bundle bundle22 = new Bundle();
                    bundle22.putBoolean("UseCache", true);
                    a = gie.m13190a(context, account.name, "oauth2: email", bundle22);
                    if (da2.f164950c) {
                    }
                    bpwb bpwb322 = (bpwb) da2.f164949b;
                    bpwb322.f139456c = 8;
                    bpwb322.f139454a |= 2;
                    if (a != null) {
                    }
                    if (da2.f164950c) {
                    }
                    bpwb bpwb422 = (bpwb) da2.f164949b;
                    bpwb422.f139456c = 13;
                    int i322 = bpwb422.f139454a | 2;
                    bpwb422.f139454a = i322;
                    bpwb422.f139455b = 230;
                    bpwb422.f139454a = i322 | 1;
                } catch (Exception e2) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpwb bpwb8 = (bpwb) da2.f164949b;
                    bpwb8.f139456c = 7;
                    bpwb8.f139454a = 2 | bpwb8.f139454a;
                    int a4 = m74159a(e2);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpwb bpwb9 = (bpwb) da2.f164949b;
                    int i6 = a4 - 1;
                    if (a4 != 0) {
                        bpwb9.f139455b = i6;
                        bpwb9.f139454a |= 1;
                    } else {
                        throw null;
                    }
                }
                if (da.f164950c) {
                }
                bpwc bpwc3222 = (bpwc) da.f164949b;
                bpwb bpwb5222 = (bpwb) da2.mo74062i();
                bpwb5222.getClass();
                bpwc3222.f139460b = bpwb5222;
                bpwc3222.f139459a |= 1;
                bpwc bpwc4222 = (bpwc) da.mo74062i();
                if (bxvd.f164950c) {
                }
                bpwd = (bpwd) bxvd.f164949b;
                bpwd bpwd2222 = bpwd.f139463b;
                bpwc4222.getClass();
                if (bpwd.f139465a.mo73666a()) {
                }
                bpwd.f139465a.add(bpwc4222);
            }
        }
    }
}
