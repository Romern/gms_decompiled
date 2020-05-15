package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Collections;

/* renamed from: avba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avba extends avau {

    /* renamed from: k */
    private static final bngx f92892k = bngx.m109361a(bxsl.DEVICE_INFO, bxsl.LOCATION_HISTORY, bxsl.VOICE_AND_AUDIO, bxsl.WEB_AND_APP, bxsl.YT_SEARCH_HISTORY, bxsl.YT_WATCH_HISTORY);

    public avba(Context context, avdl avdl, ClientContext clientContext, String str, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, "FetchSettingDisplayInfoOperation", avap, bArr);
    }

    /* renamed from: a */
    private final Intent m78175a(String str, String str2, String str3, int i) {
        String str4;
        int i2;
        if (str3 == null) {
            Intent intent = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms");
            switch (i) {
                case 1:
                case 8:
                case 10:
                    i2 = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD;
                    break;
                case 2:
                    i2 = 227;
                    break;
                case 3:
                    i2 = 228;
                    break;
                case 4:
                    i2 = 229;
                    break;
                case 5:
                    i2 = 225;
                    break;
                case 6:
                default:
                    i2 = BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD;
                    break;
                case 7:
                case 9:
                    i2 = 226;
                    break;
            }
            return intent.putExtra("extra.screenId", i2).putExtra("extra.accountName", str);
        }
        Context context = this.f92882c;
        switch (i) {
            case 1:
            case 8:
            case 10:
                str4 = "app";
                break;
            case 2:
                str4 = "location";
                break;
            case 3:
                str4 = "ytsearch";
                break;
            case 4:
                str4 = "ytwatch";
                break;
            case 5:
                str4 = "audio";
                break;
            case 6:
            default:
                str4 = "";
                break;
            case 7:
            case 9:
                str4 = "device";
                break;
        }
        return new Intent("android.intent.action.VIEW").setData(avji.m78610a(str, Uri.parse(str4.length() == 0 ? new String("https://myaccount.google.com/activitycontrols/") : "https://myaccount.google.com/activitycontrols/".concat(str4)).buildUpon().appendQueryParameter("target_user_id", str2).appendQueryParameter("hl", avef.m78366a(context)).build().toString()));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        super.mo6502a(context);
        bxrv bxrv = (bxrv) bxrw.f164625g.mo74144da();
        try {
            mo51133b();
            bxrv.mo73635b(this.f92880b, bxus.m123744c());
            String c = mo51134c();
            String a = m78158a(((bxrw) bxrv.f164949b).f164629c);
            if (bxrv.f164950c) {
                bxrv.mo74035c();
                bxrv.f164950c = false;
            }
            bxrw bxrw = (bxrw) bxrv.f164949b;
            a.getClass();
            bxrw.f164627a |= 2;
            bxrw.f164629c = a;
            int i = 1;
            if (chbo.m148123b()) {
                avet.m78388a().mo51185a();
                if (Collections.unmodifiableList(((bxrw) bxrv.f164949b).f164630d).size() == 1) {
                    int b = ((bxrw) bxrv.f164949b).f164630d.mo74151b(0);
                    bxsl a2 = bxsl.m123066a(b);
                    if (a2 == null || !f92892k.contains(a2)) {
                        throw new aaaj(4501, "Invalid setting ID, only top-level UDC settings are supported.");
                    }
                    SettingDisplayInfo settingDisplayInfo = new SettingDisplayInfo(new SettingState(b, 999), "", "");
                    boolean a3 = bmwb.m108443a("me", ((bxrw) bxrv.f164949b).f164629c);
                    String str5 = this.f92885f;
                    String str6 = ((bxrw) bxrv.f164949b).f164629c;
                    if (!a3) {
                        str4 = str6;
                    } else {
                        str4 = null;
                    }
                    this.f92883d.mo51158a(new Status(0), settingDisplayInfo, spn.m35844a(this.f92882c, m78175a(str5, str6, str4, b), 134217728));
                    return;
                }
                throw new aaaj(4501, "FetchSettingDisplayInfoOperation requires exactly one setting ID.");
            }
            bxss bxss = ((bxrw) bxrv.f164949b).f164631e;
            if (bxss == null) {
                bxss = bxss.f164728i;
            }
            bxvd a4 = mo51130a(bxss);
            bxre a5 = aviz.m78598a(this.f92882c, c);
            if (a5 != null) {
                if (bxrv.f164950c) {
                    bxrv.mo74035c();
                    bxrv.f164950c = false;
                }
                bxrw bxrw2 = (bxrw) bxrv.f164949b;
                a5.getClass();
                bxrw2.f164628b = a5;
                bxrw2.f164627a |= 1;
            }
            if (m78159a(((bxrw) bxrv.f164949b).f164629c, c)) {
                avcc a6 = mo51129a();
                avcb a7 = a6.mo51137a();
                if (a7 != null) {
                    if (Status.f30107a.equals(a7.f92942a)) {
                        if (bxrv.f164950c) {
                            bxrv.mo74035c();
                            bxrv.f164950c = false;
                        }
                        ((bxrw) bxrv.f164949b).f164632f = bxvk.m124030de();
                        bxrv.mo73615a(a7.f92943b);
                    }
                }
                bxsr b2 = a6.mo51141b();
                if (b2 != null) {
                    if (a4.f164950c) {
                        a4.mo74035c();
                        a4.f164950c = false;
                    }
                    bxss bxss2 = (bxss) a4.f164949b;
                    b2.getClass();
                    bxss2.f164737h = b2;
                    bxss2.f164730a |= 128;
                } else {
                    if (a4.f164950c) {
                        a4.mo74035c();
                        a4.f164950c = false;
                    }
                    bxss bxss3 = (bxss) a4.f164949b;
                    bxss3.f164737h = null;
                    bxss3.f164730a &= -129;
                }
            }
            if (bxrv.f164950c) {
                bxrv.mo74035c();
                bxrv.f164950c = false;
            }
            bxrw bxrw3 = (bxrw) bxrv.f164949b;
            bxss bxss4 = (bxss) a4.mo74062i();
            bxss4.getClass();
            bxrw3.f164631e = bxss4;
            bxrw3.f164627a |= 8;
            bxrx a8 = ((avau) this).f92879a.mo51117a(this.f92884e, (bxrw) bxrv.mo74062i());
            bxrf bxrf = a8.f164636b;
            if (bxrf == null) {
                bxrf = bxrf.f164550c;
            }
            aviz.m78599a(bxrf, this.f92882c, c);
            if (a8.f164638d.size() == 1) {
                bxsf bxsf = (bxsf) a8.f164638d.get(0);
                bxsi bxsi = bxsf.f164677b;
                if (bxsi == null) {
                    bxsi = bxsi.f164681e;
                }
                int a9 = bxsh.m123062a(bxsi.f164686d);
                if (a9 != 0) {
                    if (a9 == 5) {
                        throw new aaaj(4501, null);
                    }
                }
                mo51131a(0);
                if ((a8.f164635a & 8) != 0) {
                    bxsk bxsk = a8.f164637c;
                    if (bxsk == null) {
                        bxsk = bxsk.f164695d;
                    }
                    str = bxsk.f164699c;
                } else {
                    str = null;
                }
                String str7 = this.f92885f;
                String str8 = ((bxrw) bxrv.f164949b).f164629c;
                bxsi bxsi2 = bxsf.f164677b;
                if (bxsi2 == null) {
                    bxsi2 = bxsi.f164681e;
                }
                Intent a10 = m78175a(str7, str8, str, bxsi2.f164684b);
                bxsi bxsi3 = bxsf.f164677b;
                if (bxsi3 == null) {
                    bxsi3 = bxsi.f164681e;
                }
                int i2 = bxsi3.f164684b;
                bxsi bxsi4 = bxsf.f164677b;
                if (bxsi4 == null) {
                    bxsi4 = bxsi.f164681e;
                }
                int a11 = bxsn.m123069a(bxsi4.f164685c);
                if (a11 != 0) {
                    i = a11;
                }
                SettingState settingState = new SettingState(i2, i - 1);
                if ((bxsf.f164676a & 32) != 0) {
                    bxsk bxsk2 = bxsf.f164678c;
                    if (bxsk2 == null) {
                        bxsk2 = bxsk.f164695d;
                    }
                    str2 = bxsk2.f164699c;
                } else {
                    str2 = null;
                }
                if ((bxsf.f164676a & 64) != 0) {
                    bxsk bxsk3 = bxsf.f164679d;
                    if (bxsk3 == null) {
                        bxsk3 = bxsk.f164695d;
                    }
                    str3 = bxsk3.f164699c;
                } else {
                    str3 = null;
                }
                this.f92883d.mo51158a(new Status(0), new SettingDisplayInfo(settingState, str2, str3), spn.m35844a(this.f92882c, a10, 134217728));
                return;
            }
            throw new aaaj(4505, null);
        } catch (gid e) {
            throw new aaaj(4504, null);
        } catch (VolleyError e2) {
            throw mo51128a(e2);
        } catch (bxwf e3) {
            throw new aaaj(4503, null);
        } catch (IOException e4) {
            throw new aaaj(4505, null);
        } catch (avbp e5) {
            throw new aaaj(10, null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51158a(status, null, null);
    }
}
