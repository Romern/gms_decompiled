package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.concurrent.TimeUnit;

/* renamed from: azhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhu extends azhc {

    /* renamed from: b */
    private final LocalEntityId f99434b;

    /* renamed from: c */
    private final aznz f99435c;

    /* renamed from: d */
    private final String f99436d;

    /* renamed from: e */
    private final bngx f99437e;

    /* renamed from: f */
    private final LocalEntityId f99438f;

    /* renamed from: g */
    private final int f99439g;

    public azhu(Context context, azfx azfx, int i, LocalEntityId localEntityId, aznz aznz, String str, bngx bngx, LocalEntityId localEntityId2) {
        super(context, azfx, "trigger_spam_signal");
        this.f99439g = i;
        this.f99434b = localEntityId;
        this.f99435c = aznz;
        this.f99436d = str;
        this.f99437e = bngx;
        this.f99438f = localEntityId2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbhc cbhc = (cbhc) obj;
        afiz afiz = (afiz) azht.m85748a(this.f99339a).mo54933a(2);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(2, this.f99438f);
        if (afiz.f64276h == null) {
            afiz.f64276h = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.MatchstickAbuse/TriggerSpamSignal", ciie.m150370a(cbhc.f177115c), ciie.m150370a(cbhd.f177119a));
        }
        cbhd cbhd = (cbhd) afiz.f64277a.mo25553a(afiz.f64276h, a, cbhc, (long) afiz.f64270b, TimeUnit.MILLISECONDS);
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        cbhu cbhu;
        cbhu a;
        int i = this.f99439g;
        LocalEntityId localEntityId = this.f99434b;
        aznz aznz = this.f99435c;
        String str = this.f99436d;
        bngx bngx = this.f99437e;
        bxvd da = cbhc.f177115c.mo74144da();
        bxvd da2 = cbhb.f177109e.mo74144da();
        if (localEntityId != null) {
            cbhu a2 = localEntityId.mo60370a();
            if (a2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a2.getClass();
                ((cbhb) da2.f164949b).f177112b = a2;
            }
        } else if (aznz != null) {
            if (aznz.mo55105c()) {
                LocalEntityId a3 = azcm.m85300a(this.f99339a).mo54644a(aznz);
                if (!(a3 == null || (a = a3.mo60370a()) == null)) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a.getClass();
                    ((cbhb) da2.f164949b).f177112b = a;
                }
            } else if (aznz.mo55104b()) {
                bxvd da3 = cbhu.f177185d.mo74144da();
                int i2 = aznz.f99776c;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            String str2 = aznz.f99777d;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            cbhu cbhu2 = (cbhu) da3.f164949b;
                            str2.getClass();
                            cbhu2.f177187a = 4;
                            cbhu2.f177188b = str2;
                        } else if (i2 != 6) {
                            if (i2 != 7) {
                                cbhu = null;
                                if (cbhu != null) {
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    cbhu.getClass();
                                    ((cbhb) da2.f164949b).f177112b = cbhu;
                                }
                            } else {
                                String str3 = aznz.f99777d;
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                cbhu cbhu3 = (cbhu) da3.f164949b;
                                str3.getClass();
                                cbhu3.f177187a = 6;
                                cbhu3.f177188b = str3;
                            }
                        }
                    }
                    String str4 = aznz.f99777d;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cbhu cbhu4 = (cbhu) da3.f164949b;
                    str4.getClass();
                    cbhu4.f177187a = 5;
                    cbhu4.f177188b = str4;
                } else {
                    String str5 = aznz.f99777d;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cbhu cbhu5 = (cbhu) da3.f164949b;
                    str5.getClass();
                    cbhu5.f177187a = 2;
                    cbhu5.f177188b = str5;
                }
                String str6 = aznz.f99775b;
                str6.getClass();
                ((cbhu) da3.f164949b).f177189c = str6;
                cbhu = (cbhu) da3.mo74062i();
                if (cbhu != null) {
                }
            }
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbhb cbhb = (cbhb) da2.f164949b;
        if (i != 1) {
            cbhb.f177111a = i - 2;
            if (!TextUtils.isEmpty(str)) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str.getClass();
                ((cbhb) da2.f164949b).f177113c = str;
            }
            if (bngx != null && !bngx.isEmpty()) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cbhb cbhb2 = (cbhb) da2.f164949b;
                if (!cbhb2.f177114d.mo73666a()) {
                    cbhb2.f177114d = GeneratedMessageLite.m124021a(cbhb2.f177114d);
                }
                bxsy.m123078a(bngx, cbhb2.f177114d);
            }
            cbhb cbhb3 = (cbhb) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhb3.getClass();
            ((cbhc) da.f164949b).f177118b = cbhb3;
            bxvd a4 = azfn.m85571a(this.f99339a, this.f99438f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbmo cbmo = (cbmo) a4.mo74062i();
            cbmo.getClass();
            ((cbhc) da.f164949b).f177117a = cbmo;
            cbhc cbhc = (cbhc) da.mo74062i();
            new Object[1][0] = cbhc;
            return cbhc;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbhc cbhc = (cbhc) obj;
        azoj.m85931a("TriggerSpamSignalH", exc, "Error sending rpc", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbhc cbhc = (cbhc) obj;
        Void voidR = (Void) obj2;
    }
}
