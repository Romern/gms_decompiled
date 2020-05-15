package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: bguw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguw {

    /* renamed from: a */
    private static final bnhe f117609a;

    /* renamed from: b */
    private static final bnhe f117610b;

    /* renamed from: c */
    private final qws f117611c = new qws(this.f117612d, "USER_LOCATION_REPORTING", null);

    /* renamed from: d */
    private final Context f117612d;

    /* renamed from: e */
    private final IntentFilter f117613e = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("com.google.android.gms", bvza.ACR_GCORE);
        h.mo67695b("com.google.android.gms.udc", bvza.ACR_UDC);
        h.mo67695b("com.google.android.apps.fitness", bvza.ACR_GOOGLE_HEART);
        h.mo67695b("com.google.android.googlequicksearchbox", bvza.ACR_GOOGLE_NOW);
        h.mo67695b("com.google.android.apps.photos", bvza.ACR_GOOGLE_PHOTOS);
        h.mo67695b("com.google.android.apps.plus", bvza.ACR_GOOGLE_PLUS);
        h.mo67695b("com.google.android.gm", bvza.ACR_GMAIL);
        h.mo67695b("com.google.android.apps.maps", bvza.ACR_GMM);
        h.mo67695b("com.google.android.apps.gmm", bvza.ACR_GMM_DOGFOOD);
        h.mo67695b("com.google.android.apps.gmm.fishfood", bvza.ACR_GMM_FISHFOOD);
        h.mo67695b("com.google.android.apps.gmm.dev", bvza.ACR_GMM_DEV);
        h.mo67695b("com.google.android.apps.gmm.qp", bvza.ACR_GMM_QP);
        h.mo67695b("com.ridewith", bvza.ACR_RIDE_WITH);
        h.mo67695b("com.google.android.apps.mahlzeit", bvza.ACR_WAITING_TIME);
        h.mo67695b("com.google.android.apps.kids.familylink", bvza.ACR_FAMILY_COMPASS);
        h.mo67695b("com.waze", bvza.ACR_WAZE);
        h.mo67695b("com.google.android.apps.emergencyassist", bvza.ACR_EMERGENCY_ASSIST);
        h.mo67695b("com.google.android.apps.ridematch", bvza.ACR_RIDEMATCH);
        h.mo67695b("com.google.android.apps.ridematch.us", bvza.ACR_RIDEMATCH_US);
        h.mo67695b("com.google.android.apps.tycho", bvza.ACR_TYCHO);
        h.mo67695b("com.google.android.apps.youtube.music", bvza.ACR_YOUTUBE_MUSIC);
        f117609a = h.mo67618b();
        bnha h2 = bnhe.m109414h();
        h2.mo67695b(bvyy.AC_UNKNOWN, bvzk.API_CALL_UNKNOWN);
        h2.mo67695b(bvyy.AC_GET_REPORTING_STATE_SAFE, bvzk.API_CALL_GET_REPORTING_STATE_SAFE);
        h2.mo67695b(bvyy.AC_TRY_OPT_IN, bvzk.API_CALL_TRY_OPT_IN);
        h2.mo67695b(bvyy.AC_TRY_OPT_IN_REQUEST, bvzk.API_CALL_TRY_OPT_IN_REQUEST);
        h2.mo67695b(bvyy.AC_REQUEST_UPLOAD, bvzk.API_CALL_REQUEST_UPLOAD);
        h2.mo67695b(bvyy.AC_CANCEL_UPLOAD, bvzk.API_CALL_CANCEL_UPLOAD);
        h2.mo67695b(bvyy.AC_REPORT_PLACE, bvzk.API_CALL_REPORT_PLACE);
        h2.mo67695b(bvyy.AC_SEND_DATA, bvzk.API_CALL_SEND_DATA);
        h2.mo67695b(bvyy.AC_PRIVATE_MODE_TOGGLE_ON, bvzk.API_CALL_TOGGLE_PRIVATE_MODE_ON);
        h2.mo67695b(bvyy.AC_PRIVATE_MODE_TOGGLE_OFF, bvzk.API_CALL_TOGGLE_PRIVATE_MODE_OFF);
        f117610b = h2.mo67618b();
    }

    public bguw(Context context) {
        this.f117612d = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized void m100055a(bvzk bvzk, bvsy bvsy, String str) {
        qwo a = this.f117611c.mo24335a(bvsy.mo73642k());
        a.mo24328b(bvzk.f158527dy);
        a.mo24330c(str);
        a.mo24327b();
    }

    /* renamed from: b */
    static final bxvd m100057b(bvyy bvyy, String str, String str2, int i) {
        bxvd da = bvpo.f157320k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvpo bvpo = (bvpo) da.f164949b;
        bvpo.f157325d = bvyy.f158253m;
        bvpo.f157322a |= 1;
        if (str != null) {
            bvza bvza = (bvza) f117609a.get(str);
            if (bvza == null) {
                bvza bvza2 = bvza.ACR_UNKNOWN;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpo bvpo2 = (bvpo) da.f164949b;
                bvpo2.f157326e = bvza2.f158278w;
                bvpo2.f157322a |= 2;
                int hashCode = str.hashCode();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpo bvpo3 = (bvpo) da.f164949b;
                bvpo3.f157322a |= 4;
                bvpo3.f157327f = hashCode;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpo bvpo4 = (bvpo) da.f164949b;
                bvpo4.f157326e = bvza.f158278w;
                bvpo4.f157322a |= 2;
            }
        }
        if (str2 != null) {
            bvpo bvpo5 = (bvpo) da.f164949b;
            bvpo5.f157322a |= 8;
            bvpo5.f157328g = true;
            bvza bvza3 = (bvza) f117609a.get(str2);
            if (bvza3 == null) {
                bvza bvza4 = bvza.ACR_UNKNOWN;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpo bvpo6 = (bvpo) da.f164949b;
                bvpo6.f157329h = bvza4.f158278w;
                bvpo6.f157322a |= 16;
                int hashCode2 = str2.hashCode();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpo bvpo7 = (bvpo) da.f164949b;
                bvpo7.f157322a |= 32;
                bvpo7.f157330i = hashCode2;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpo bvpo8 = (bvpo) da.f164949b;
                bvpo8.f157329h = bvza3.f158278w;
                bvpo8.f157322a |= 16;
            }
        } else {
            bvpo bvpo9 = (bvpo) da.f164949b;
            bvpo9.f157322a |= 8;
            bvpo9.f157328g = false;
        }
        bvpo bvpo10 = (bvpo) da.f164949b;
        bvpo10.f157322a |= 64;
        bvpo10.f157331j = i;
        return da;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo63250c(int i) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 3;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        bvsp.f157519c = 2;
        int i3 = i2 | 2;
        bvsp.f157517a = i3;
        int i4 = i - 1;
        if (i != 0) {
            bvsp.f157520d = i4;
            bvsp.f157517a = i3 | 4;
            bvsp bvsp2 = (bvsp) da.mo74062i();
            bvzk bvzk = bvzk.RPC_GET_USER_SETTINGS_FAILURE;
            bxvd da2 = bvsy.f157537e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvsy bvsy = (bvsy) da2.f164949b;
            bvsp2.getClass();
            bvsy.f157541c = bvsp2;
            bvsy.f157540b = 93;
            m100056a(bvzk, da2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo63253d(int i) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 5;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        bvsp.f157519c = 2;
        int i3 = i2 | 2;
        bvsp.f157517a = i3;
        int i4 = i - 1;
        if (i != 0) {
            bvsp.f157520d = i4;
            bvsp.f157517a = i3 | 4;
            bvsp bvsp2 = (bvsp) da.mo74062i();
            bvzk bvzk = bvzk.RPC_REPORT_LOCATIONS_FAILURE;
            bxvd da2 = bvsy.f157537e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvsy bvsy = (bvsy) da2.f164949b;
            bvsp2.getClass();
            bvsy.f157541c = bvsp2;
            bvsy.f157540b = 93;
            m100056a(bvzk, da2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo63256e(int i) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 4;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        bvsp.f157519c = 2;
        int i3 = i2 | 2;
        bvsp.f157517a = i3;
        int i4 = i - 1;
        if (i != 0) {
            bvsp.f157520d = i4;
            bvsp.f157517a = i3 | 4;
            bvsp bvsp2 = (bvsp) da.mo74062i();
            bvzk bvzk = bvzk.RPC_SET_REMOTE_DEVICE_SETTINGS_FAILURE;
            bxvd da2 = bvsy.f157537e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvsy bvsy = (bvsy) da2.f164949b;
            bvsp2.getClass();
            bvsy.f157541c = bvsp2;
            bvsy.f157540b = 93;
            m100056a(bvzk, da2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo63259f(int i) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 2;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        bvsp.f157519c = 2;
        int i3 = 2 | i2;
        bvsp.f157517a = i3;
        int i4 = i - 1;
        if (i != 0) {
            bvsp.f157520d = i4;
            bvsp.f157517a = i3 | 4;
            bvsp bvsp2 = (bvsp) da.mo74062i();
            bvzk bvzk = bvzk.RPC_SET_SETTINGS_FAILURE;
            bxvd da2 = bvsy.f157537e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvsy bvsy = (bvsy) da2.f164949b;
            bvsp2.getClass();
            bvsy.f157541c = bvsp2;
            bvsy.f157540b = 93;
            m100056a(bvzk, da2);
        } else {
            throw null;
        }
    }

    /* renamed from: g */
    public final synchronized void mo63261g(boolean z) {
        bxvd da = bvqk.f157377c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvqk bvqk = (bvqk) da.f164949b;
        bvqk.f157379a |= 1;
        bvqk.f157380b = z;
        bvqk bvqk2 = (bvqk) da.mo74062i();
        bvzk bvzk = bvzk.DEEP_STILL_CHANGED;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvqk2.getClass();
        bvsy.f157541c = bvqk2;
        bvsy.f157540b = 102;
        m100056a(bvzk, da2);
    }

    /* renamed from: h */
    public final synchronized void mo63262h(boolean z) {
        bvzk bvzk;
        bxvd da = bvsy.f157537e.mo74144da();
        if (!z) {
            bvqn bvqn = bvqn.f157396a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsy bvsy = (bvsy) da.f164949b;
            bvqn.getClass();
            bvsy.f157541c = bvqn;
            bvsy.f157540b = 85;
            bvzk = bvzk.DISABLE_LR_SUCCESS;
        } else {
            bvqs bvqs = bvqs.f157406a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsy bvsy2 = (bvsy) da.f164949b;
            bvqs.getClass();
            bvsy2.f157541c = bvqs;
            bvsy2.f157540b = 84;
            bvzk = bvzk.ENABLE_LR_SUCCESS;
        }
        m100056a(bvzk, da);
    }

    /* renamed from: i */
    public final synchronized void mo63263i(boolean z) {
        bvzk bvzk;
        bxvd da = bvsy.f157537e.mo74144da();
        if (!z) {
            bvqm bvqm = bvqm.f157394a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsy bvsy = (bvsy) da.f164949b;
            bvqm.getClass();
            bvsy.f157541c = bvqm;
            bvsy.f157540b = 83;
            bvzk = bvzk.DISABLE_LH_SUCCESS;
        } else {
            bvqr bvqr = bvqr.f157404a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsy bvsy2 = (bvsy) da.f164949b;
            bvqr.getClass();
            bvsy2.f157541c = bvqr;
            bvsy2.f157540b = 82;
            bvzk = bvzk.ENABLE_LH_SUCCESS;
        }
        m100056a(bvzk, da);
    }

    /* renamed from: a */
    private final synchronized void m100056a(bvzk bvzk, bxvd bxvd) {
        bxvd da = bvsz.f157543h.mo74144da();
        int a = spo.m35902a(this.f117612d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsz bvsz = (bvsz) da.f164949b;
        int i = bvsz.f157545a | 16;
        bvsz.f157545a = i;
        bvsz.f157546b = a;
        bvsz.f157545a = i | 32;
        bvsz.f157547c = 0;
        Intent registerReceiver = this.f117612d.registerReceiver(null, this.f117613e);
        int i2 = 3;
        if (registerReceiver != null) {
            int round = Math.round(((float) (registerReceiver.getIntExtra("level", -1) * 100)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsz bvsz2 = (bvsz) da.f164949b;
            bvsz2.f157545a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bvsz2.f157549e = round;
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz3 = (bvsz) da.f164949b;
                bvsz3.f157550f = 2;
                bvsz3.f157545a = 262144 | bvsz3.f157545a;
            } else if (intExtra == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz4 = (bvsz) da.f164949b;
                bvsz4.f157550f = 1;
                bvsz4.f157545a = 262144 | bvsz4.f157545a;
            } else if (intExtra == 4) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz5 = (bvsz) da.f164949b;
                bvsz5.f157550f = 4;
                bvsz5.f157545a = 262144 | bvsz5.f157545a;
            } else if (intExtra != 5) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz6 = (bvsz) da.f164949b;
                bvsz6.f157550f = 0;
                bvsz6.f157545a = 262144 | bvsz6.f157545a;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz7 = (bvsz) da.f164949b;
                bvsz7.f157550f = 3;
                bvsz7.f157545a = 262144 | bvsz7.f157545a;
            }
            int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
            if (intExtra2 == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz8 = (bvsz) da.f164949b;
                bvsz8.f157551g = 3;
                bvsz8.f157545a = 524288 | bvsz8.f157545a;
            } else if (intExtra2 == 2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz9 = (bvsz) da.f164949b;
                bvsz9.f157551g = 2;
                bvsz9.f157545a = 524288 | bvsz9.f157545a;
            } else if (intExtra2 != 4) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz10 = (bvsz) da.f164949b;
                bvsz10.f157551g = 0;
                bvsz10.f157545a = 524288 | bvsz10.f157545a;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvsz bvsz11 = (bvsz) da.f164949b;
                bvsz11.f157551g = 4;
                bvsz11.f157545a = 524288 | bvsz11.f157545a;
            }
        }
        PowerManager powerManager = (PowerManager) this.f117612d.getSystemService("power");
        if (powerManager != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (powerManager.isPowerSaveMode()) {
                i2 = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsz bvsz12 = (bvsz) da.f164949b;
            bvsz12.f157548d = i2 - 1;
            bvsz12.f157545a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsz bvsz13 = (bvsz) da.f164949b;
            bvsz13.f157548d = 0;
            bvsz13.f157545a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvsy bvsy = (bvsy) bxvd.f164949b;
        bvsz bvsz14 = (bvsz) da.mo74062i();
        bvsy bvsy2 = bvsy.f157537e;
        bvsz14.getClass();
        bvsy.f157542d = bvsz14;
        bvsy.f157539a |= 1;
        qwo a2 = this.f117611c.mo24335a(((bvsy) bxvd.mo74062i()).mo73642k());
        a2.mo24328b(bvzk.f158527dy);
        a2.mo24327b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo63251c(long j) {
        bxvd da = bvso.f157508f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvso bvso = (bvso) da.f164949b;
        int i = bvso.f157510a | 2;
        bvso.f157510a = i;
        bvso.f157514e = j;
        bvso.f157513d = 2;
        bvso.f157510a = i | 1;
        bvso bvso2 = (bvso) da.mo74062i();
        bvzk bvzk = bvzk.RPC_SET_SETTINGS_REQUEST;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvso2.getClass();
        bvsy.f157541c = bvso2;
        bvsy.f157540b = 92;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo63254d(long j) {
        bxvd da = bvso.f157508f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvso bvso = (bvso) da.f164949b;
        int i = bvso.f157510a | 2;
        bvso.f157510a = i;
        bvso.f157514e = j;
        bvso.f157513d = 3;
        bvso.f157510a = i | 1;
        bvso bvso2 = (bvso) da.mo74062i();
        bvzk bvzk = bvzk.RPC_GET_USER_SETTINGS_REQUEST;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvso2.getClass();
        bvsy.f157541c = bvso2;
        bvsy.f157540b = 92;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo63257e(long j) {
        bxvd da = bvso.f157508f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvso bvso = (bvso) da.f164949b;
        int i = bvso.f157510a | 2;
        bvso.f157510a = i;
        bvso.f157514e = j;
        bvso.f157513d = 4;
        bvso.f157510a = i | 1;
        bvso bvso2 = (bvso) da.mo74062i();
        bvzk bvzk = bvzk.RPC_SET_REMOTE_DEVICE_SETTINGS_REQUEST;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvso2.getClass();
        bvsy.f157541c = bvso2;
        bvsy.f157540b = 92;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo63260f(boolean z) {
        int i;
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 4;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        bvsp.f157519c = i - 1;
        bvsp.f157517a = i2 | 2;
        bvsp bvsp2 = (bvsp) da.mo74062i();
        bvzk bvzk = z ? bvzk.RPC_SET_REMOTE_DEVICE_SETTINGS_SUCCESS : bvzk.RPC_SET_REMOTE_DEVICE_SETTINGS_FAILURE;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsp2.getClass();
        bvsy.f157541c = bvsp2;
        bvsy.f157540b = 93;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo63252c(boolean z) {
        int i;
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 1;
        int i2 = 1 | bvsp.f157517a;
        bvsp.f157517a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        bvsp.f157519c = i - 1;
        bvsp.f157517a = i2 | 2;
        bvsp bvsp2 = (bvsp) da.mo74062i();
        bvzk bvzk = !z ? bvzk.RPC_GET_SETTINGS_FAILURE : bvzk.RPC_GET_SETTINGS_SUCCESS;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsp2.getClass();
        bvsy.f157541c = bvsp2;
        bvsy.f157540b = 93;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo63255d(boolean z) {
        int i;
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 2;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        bvsp.f157519c = i - 1;
        bvsp.f157517a = 2 | i2;
        bvsp bvsp2 = (bvsp) da.mo74062i();
        bvzk bvzk = !z ? bvzk.RPC_SET_SETTINGS_FAILURE : bvzk.RPC_SET_SETTINGS_SUCCESS;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsp2.getClass();
        bvsy.f157541c = bvsp2;
        bvsy.f157540b = 93;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo63258e(boolean z) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        int i = 3;
        bvsp.f157518b = 3;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        if (z) {
            i = 2;
        }
        bvsp.f157519c = i - 1;
        bvsp.f157517a = i2 | 2;
        bvsp bvsp2 = (bvsp) da.mo74062i();
        bvzk bvzk = z ? bvzk.RPC_GET_USER_SETTINGS_SUCCESS : bvzk.RPC_GET_USER_SETTINGS_FAILURE;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsp2.getClass();
        bvsy.f157541c = bvsp2;
        bvsy.f157540b = 93;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo63247b(int i) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 1;
        int i2 = 1 | bvsp.f157517a;
        bvsp.f157517a = i2;
        bvsp.f157519c = 2;
        int i3 = i2 | 2;
        bvsp.f157517a = i3;
        int i4 = i - 1;
        if (i != 0) {
            bvsp.f157520d = i4;
            bvsp.f157517a = i3 | 4;
            bvsp bvsp2 = (bvsp) da.mo74062i();
            bvzk bvzk = bvzk.RPC_GET_SETTINGS_FAILURE;
            bxvd da2 = bvsy.f157537e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvsy bvsy = (bvsy) da2.f164949b;
            bvsp2.getClass();
            bvsy.f157541c = bvsp2;
            bvsy.f157540b = 93;
            m100056a(bvzk, da2);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo63248b(long j) {
        bxvd da = bvso.f157508f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvso bvso = (bvso) da.f164949b;
        int i = bvso.f157510a | 2;
        bvso.f157510a = i;
        bvso.f157514e = j;
        bvso.f157513d = 1;
        bvso.f157510a = 1 | i;
        bvso bvso2 = (bvso) da.mo74062i();
        bvzk bvzk = bvzk.RPC_GET_SETTINGS_REQUEST;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvso2.getClass();
        bvsy.f157541c = bvso2;
        bvsy.f157540b = 92;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo63249b(boolean z) {
        int i;
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 6;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        bvsp.f157519c = i - 1;
        bvsp.f157517a = i2 | 2;
        bvsp bvsp2 = (bvsp) da.mo74062i();
        bvzk bvzk = !z ? bvzk.RPC_DELETE_LOCATIONS_FAILURE : bvzk.RPC_DELETE_LOCATIONS_SUCCESS;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsp2.getClass();
        bvsy.f157541c = bvsp2;
        bvsy.f157540b = 93;
        m100056a(bvzk, da2);
    }

    /* renamed from: a */
    public final synchronized void mo63236a() {
        bvpn bvpn = bvpn.f157318a;
        bvzk bvzk = bvzk.ACTIVITY_RECOGNITION_ACTIVITY_RECEIVED;
        bxvd da = bvsy.f157537e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsy bvsy = (bvsy) da.f164949b;
        bvpn.getClass();
        bvsy.f157541c = bvpn;
        bvsy.f157540b = 90;
        m100056a(bvzk, da);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63237a(int i) {
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 6;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        bvsp.f157519c = 2;
        int i3 = i2 | 2;
        bvsp.f157517a = i3;
        int i4 = i - 1;
        if (i != 0) {
            bvsp.f157520d = i4;
            bvsp.f157517a = i3 | 4;
            bvsp bvsp2 = (bvsp) da.mo74062i();
            bvzk bvzk = bvzk.RPC_DELETE_LOCATIONS_FAILURE;
            bxvd da2 = bvsy.f157537e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvsy bvsy = (bvsy) da2.f164949b;
            bvsp2.getClass();
            bvsy.f157541c = bvsp2;
            bvsy.f157540b = 93;
            m100056a(bvzk, da2);
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo63238a(int i, Boolean bool) {
        bxvd da = bvtk.f157572d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtk bvtk = (bvtk) da.f164949b;
        bvtk.f157574a |= 1;
        bvtk.f157575b = i;
        int a = bgux.m100087a(bool);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtk bvtk2 = (bvtk) da.f164949b;
        bvtk2.f157576c = a - 1;
        bvtk2.f157574a |= 2;
        bvtk bvtk3 = (bvtk) da.mo74062i();
        bvzk bvzk = bvzk.WIFI_SCAN;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvtk3.getClass();
        bvsy.f157541c = bvtk3;
        bvsy.f157540b = 87;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63239a(long j) {
        bxvd da = bvso.f157508f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvso bvso = (bvso) da.f164949b;
        int i = bvso.f157510a | 2;
        bvso.f157510a = i;
        bvso.f157514e = j;
        bvso.f157513d = 6;
        bvso.f157510a = i | 1;
        bvso bvso2 = (bvso) da.mo74062i();
        bvzk bvzk = bvzk.RPC_DELETE_LOCATIONS_REQUEST;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvso2.getClass();
        bvsy.f157541c = bvso2;
        bvsy.f157540b = 92;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63240a(long j, long j2, long j3, long j4) {
        bxvd da = bvsn.f157502e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsn bvsn = (bvsn) da.f164949b;
        int i = bvsn.f157504a | 1;
        bvsn.f157504a = i;
        bvsn.f157505b = j2;
        int i2 = i | 2;
        bvsn.f157504a = i2;
        bvsn.f157506c = j3;
        bvsn.f157504a = i2 | 4;
        bvsn.f157507d = j4;
        bvsn bvsn2 = (bvsn) da.mo74062i();
        bxvd da2 = bvso.f157508f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvso bvso = (bvso) da2.f164949b;
        int i3 = bvso.f157510a | 2;
        bvso.f157510a = i3;
        bvso.f157514e = j;
        bvso.f157513d = 5;
        bvso.f157510a = i3 | 1;
        bvsn2.getClass();
        bvso.f157512c = bvsn2;
        bvso.f157511b = 3;
        bvso bvso2 = (bvso) da2.mo74062i();
        bvzk bvzk = bvzk.RPC_REPORT_LOCATIONS_REQUEST;
        bxvd da3 = bvsy.f157537e.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bvsy bvsy = (bvsy) da3.f164949b;
        bvso2.getClass();
        bvsy.f157541c = bvso2;
        bvsy.f157540b = 92;
        m100056a(bvzk, da3);
    }

    /* renamed from: a */
    public final synchronized void mo63241a(bvql bvql, bvzk bvzk, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) list.get(i);
            bxvd da = bvsy.f157537e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsy bvsy = (bvsy) da.f164949b;
            bvql.getClass();
            bvsy.f157541c = bvql;
            bvsy.f157540b = ErrorInfo.TYPE_SDU_MEMORY_FULL;
            m100055a(bvzk, (bvsy) da.mo74062i(), account.name);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63242a(bvyy bvyy, bxvd bxvd) {
        if (chcs.m148232d()) {
            bxvd da = bvsy.f157537e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvsy bvsy = (bvsy) da.f164949b;
            bvpo bvpo = (bvpo) bxvd.mo74062i();
            bvpo.getClass();
            bvsy.f157541c = bvpo;
            bvsy.f157540b = ErrorInfo.TYPE_SDU_FAILED;
            m100056a((bvzk) f117610b.getOrDefault(bvyy, bvzk.UNKNOWN_EVENT), da);
        }
    }

    /* renamed from: a */
    public final synchronized void mo63243a(bvyy bvyy, String str, String str2, int i) {
        if (chcs.m148232d()) {
            mo63242a(bvyy, m100057b(bvyy, str, str2, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63244a(bvyy bvyy, String str, String str2, UploadRequest uploadRequest, UploadRequestResult uploadRequestResult) {
        if (chcs.m148232d()) {
            bxvd da = bvpp.f157332d.mo74144da();
            bxvd b = m100057b(bvyy, str, str2, uploadRequestResult.f79618a);
            if (uploadRequestResult.f79618a != 4) {
                String str3 = uploadRequest.f79613b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvpp bvpp = (bvpp) da.f164949b;
                str3.getClass();
                int i = bvpp.f157334a | 1;
                bvpp.f157334a = i;
                bvpp.f157335b = str3;
                String str4 = uploadRequest.f79617f;
                str4.getClass();
                bvpp.f157334a = i | 2;
                bvpp.f157336c = str4;
            }
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bvpo bvpo = (bvpo) b.f164949b;
            bvpp bvpp2 = (bvpp) da.mo74062i();
            bvpo bvpo2 = bvpo.f157320k;
            bvpp2.getClass();
            bvpo.f157324c = bvpp2;
            bvpo.f157323b = 8;
            mo63242a(bvyy, b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo63245a(Boolean bool) {
        bxvd da = bvsh.f157488c.mo74144da();
        int a = bgux.m100087a(bool);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsh bvsh = (bvsh) da.f164949b;
        bvsh.f157491b = a - 1;
        bvsh.f157490a |= 4;
        bvsh bvsh2 = (bvsh) da.mo74062i();
        bvzk bvzk = bvzk.LOCATION_UPDATE;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsh2.getClass();
        bvsy.f157541c = bvsh2;
        bvsy.f157540b = 95;
        m100056a(bvzk, da2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63246a(boolean z) {
        int i;
        bxvd da = bvsp.f157515e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvsp bvsp = (bvsp) da.f164949b;
        bvsp.f157518b = 5;
        int i2 = bvsp.f157517a | 1;
        bvsp.f157517a = i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        bvsp.f157519c = i - 1;
        bvsp.f157517a = i2 | 2;
        bvsp bvsp2 = (bvsp) da.mo74062i();
        bvzk bvzk = !z ? bvzk.RPC_REPORT_LOCATIONS_FAILURE : bvzk.RPC_REPORT_LOCATIONS_SUCCESS;
        bxvd da2 = bvsy.f157537e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvsy bvsy = (bvsy) da2.f164949b;
        bvsp2.getClass();
        bvsy.f157541c = bvsp2;
        bvsy.f157540b = 93;
        m100056a(bvzk, da2);
    }
}
