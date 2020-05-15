package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: axig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axig extends axlx {

    /* renamed from: a */
    final awkh f95985a;

    /* renamed from: g */
    private final int f95986g;

    /* renamed from: h */
    private final long f95987h;

    /* renamed from: i */
    private final String f95988i;

    /* renamed from: j */
    private final boolean f95989j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axig(Context context, int i, long j, String str, boolean z, int i2, Account account, axls axls, axls axls2) {
        super(context, i2, account, axls, axls2);
        int i3;
        this.f95986g = i;
        this.f95987h = j;
        this.f95988i = str;
        this.f95989j = z;
        awbt awbt = new awbt();
        if (!axmb.m82713a(axmb.m82712a())) {
            i3 = 3;
        } else {
            i3 = 1;
        }
        awbt.mo51835a(i3);
        this.f95985a = awbv.m79579a(context, awbt.mo51834a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02bd  */
    /* renamed from: a */
    public final void mo53158a() {
        String str;
        bngx bngx;
        String str2;
        int i;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] b = mo53161b();
        ArrayList arrayList = new ArrayList();
        int i2 = this.f95986g;
        if (i2 == 1) {
            bxvd da = bttk.f150356c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bttk bttk = (bttk) da.f164949b;
            bttk.f150359b = 1;
            bttk.f150358a = 3;
            arrayList.add((bttk) da.mo74062i());
        } else if (i2 == 2) {
            bxvd da2 = bttk.f150356c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bttk bttk2 = (bttk) da2.f164949b;
            bttk2.f150359b = 2;
            bttk2.f150358a = 3;
            arrayList.add((bttk) da2.mo74062i());
        }
        if (this.f95987h > 0 && !TextUtils.isEmpty(this.f95988i)) {
            bxvd da3 = bttk.f150356c.mo74144da();
            bxvd da4 = btsc.f150179d.mo74144da();
            bxvd da5 = btsb.f150174d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            btsb btsb = (btsb) da5.f164949b;
            int i3 = btsb.f150176a | 1;
            btsb.f150176a = i3;
            btsb.f150177b = 0;
            String str4 = this.f95988i;
            str4.getClass();
            btsb.f150176a = i3 | 2;
            btsb.f150178c = str4;
            btsb btsb2 = (btsb) da5.mo74062i();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            btsc btsc = (btsc) da4.f164949b;
            btsb2.getClass();
            btsc.f150182b = btsb2;
            btsc.f150181a |= 1;
            bxvd da6 = btsb.f150174d.mo74144da();
            long j = this.f95987h;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btsb btsb3 = (btsb) da6.f164949b;
            int i4 = btsb3.f150176a | 1;
            btsb3.f150176a = i4;
            btsb3.f150177b = j;
            String str5 = this.f95988i;
            str5.getClass();
            btsb3.f150176a = i4 | 2;
            btsb3.f150178c = str5;
            btsb btsb4 = (btsb) da6.mo74062i();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            btsc btsc2 = (btsc) da4.f164949b;
            btsb4.getClass();
            btsc2.f150183c = btsb4;
            btsc2.f150181a |= 2;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bttk bttk3 = (bttk) da3.f164949b;
            btsc btsc3 = (btsc) da4.mo74062i();
            btsc3.getClass();
            bttk3.f150359b = btsc3;
            bttk3.f150358a = 1;
            arrayList.add((bttk) da3.mo74062i());
        }
        bttn bttn = (bttn) btto.f150366f.mo74144da();
        String str6 = this.f95988i;
        if (bttn.f164950c) {
            bttn.mo74035c();
            bttn.f164950c = false;
        }
        btto btto = (btto) bttn.f164949b;
        str6.getClass();
        btto.f150368a |= 4;
        btto.f150371d = str6;
        if (b != null) {
            bxvd da7 = btse.f150191c.mo74144da();
            ByteString a = ByteString.m123261a(b);
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            btse btse = (btse) da7.f164949b;
            a.getClass();
            btse.f150193a |= 1;
            btse.f150194b = a;
            if (bttn.f164950c) {
                bttn.mo74035c();
                bttn.f164950c = false;
            }
            btto btto2 = (btto) bttn.f164949b;
            btse btse2 = (btse) da7.mo74062i();
            btse2.getClass();
            btto2.f150369b = btse2;
            btto2.f150368a |= 1;
        }
        if (!arrayList.isEmpty()) {
            if (bttn.f164950c) {
                bttn.mo74035c();
                bttn.f164950c = false;
            }
            btto btto3 = (btto) bttn.f164949b;
            if (!btto3.f150370c.mo73666a()) {
                btto3.f150370c = GeneratedMessageLite.m124021a(btto3.f150370c);
            }
            bxsy.m123078a(arrayList, btto3.f150370c);
        }
        if (this.f95989j) {
            bttn.mo70840a(bttr.STORE_VALUE_CREATION);
        }
        bttn.mo70840a(bttr.CALL_ERROR_HTML);
        try {
            bttp bttp = (bttp) axmo.m82727a("b/instrumentv2/listAllInstruments", this.f96167c, bttn.mo74062i(), bttp.f150373j, this.f96170f).get();
            if ((bttp.f150375a & 1) != 0) {
                bzvu bzvu = bttp.f150376b;
                if (bzvu == null) {
                    bzvu = bzvu.f171552g;
                }
                mo53235a(bzvu);
            } else if (bttp.f150378d.size() <= 0 && bttp.f150377c.size() <= 0) {
                mo53234a(13);
            } else {
                ArrayList arrayList2 = new ArrayList(bttp.f150378d.size());
                bxwc bxwc = bttp.f150378d;
                int size = bxwc.size();
                for (int i5 = 0; i5 < size; i5++) {
                    btru btru = (btru) bxwc.get(i5);
                    btrv btrv = btru.f150153b;
                    if (btrv == null) {
                        btrv = btrv.f150156e;
                    }
                    if (!btrv.f150160c.isEmpty()) {
                        btrw btrw = btru.f150152a;
                        if (btrw == null) {
                            btrw = btrw.f150162c;
                        }
                        String str7 = btrw.f150165b;
                        btrv btrv2 = btru.f150153b;
                        if (btrv2 == null) {
                            btrv2 = btrv.f150156e;
                        }
                        String str8 = btrv2.f150160c;
                        btrv btrv3 = btru.f150153b;
                        if (btrv3 == null) {
                            btrv3 = btrv.f150156e;
                        }
                        if ((btrv3.f150158a & 32) != 0) {
                            btrv btrv4 = btru.f150153b;
                            if (btrv4 == null) {
                                btrv4 = btrv.f150156e;
                            }
                            str2 = btrv4.f150161d;
                        } else {
                            str2 = null;
                        }
                        btrz btrz = btru.f150154c;
                        if (btrz == null) {
                            btrz = btrz.f150167e;
                        }
                        int a2 = btry.m117084a(btrz.f150170b);
                        if (a2 != 0 && a2 == 2) {
                            i = 1;
                        } else {
                            btrz btrz2 = btru.f150154c;
                            if (btrz2 == null) {
                                btrz2 = btrz.f150167e;
                            }
                            i = (btrz2.f150169a & 4) == 0 ? 3 : 2;
                        }
                        btrv btrv5 = btru.f150153b;
                        if (btrv5 == null) {
                            btrv5 = btrv.f150156e;
                        }
                        if ((btrv5.f150158a & 4) != 0) {
                            btrv btrv6 = btru.f150153b;
                            if (btrv6 == null) {
                                btrv6 = btrv.f150156e;
                            }
                            str3 = btrv6.f150159b;
                        } else {
                            str3 = null;
                        }
                        btrz btrz3 = btru.f150154c;
                        if (btrz3 == null) {
                            btrz3 = btrz.f150167e;
                        }
                        if ((btrz3.f150169a & 4) != 0) {
                            btrz btrz4 = btru.f150154c;
                            if (btrz4 == null) {
                                btrz4 = btrz.f150167e;
                            }
                            bArr = btrz4.f150171c.getKey();
                        } else {
                            bArr = null;
                        }
                        btrz btrz5 = btru.f150154c;
                        if (btrz5 == null) {
                            btrz5 = btrz.f150167e;
                        }
                        if ((btrz5.f150169a & 16) != 0) {
                            btrz btrz6 = btru.f150154c;
                            if (btrz6 == null) {
                                btrz6 = btrz.f150167e;
                            }
                            bArr2 = btrz6.f150172d.getKey();
                        } else {
                            bArr2 = null;
                        }
                        arrayList2.add(new Instrument(str7, str8, str2, i, str3, bArr, bArr2));
                    }
                }
                ArrayList arrayList3 = new ArrayList(bttp.f150377c.size());
                bxwc bxwc2 = bttp.f150377c;
                int size2 = bxwc2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    btsd btsd = (btsd) bxwc2.get(i6);
                    arrayList3.add(new InstrumentCreationToken(btsd.f150188c.getKey(), btsd.f150186a, btsd.f150187b, btsd.f150189d.getKey()));
                }
                String str9 = bttp.f150382h;
                if (TextUtils.isEmpty(str9) && (bttp.f150375a & 16) != 0) {
                    bttg bttg = bttp.f150379e;
                    if (bttg == null) {
                        bttg = bttg.f150341b;
                    }
                    String str10 = bttg.f150343a;
                    if ("US".equals(str10)) {
                        str9 = "USD";
                    } else if ("UK".equals(str10) || "GB".equals(str10)) {
                        str = "GBP";
                        bngx a3 = bttp.f150383i.size() == 0 ? bngx.m109368a((Collection) bttp.f150383i) : bngx.m109376e();
                        if (bttp.f150381g.size() == 0) {
                            bngx = bngx.m109368a((Collection) bttp.f150381g);
                        } else {
                            bngx = bngx.m109376e();
                        }
                        if (TextUtils.isEmpty(str)) {
                            mo53236a(new axil(arrayList2, arrayList3, a3, bngx, str, bttp.f150380f.getKey()));
                            return;
                        } else {
                            mo53234a(16510);
                            return;
                        }
                    }
                }
                str = str9;
                if (bttp.f150383i.size() == 0) {
                }
                if (bttp.f150381g.size() == 0) {
                }
                if (TextUtils.isEmpty(str)) {
                }
            }
        } catch (ExecutionException e) {
            if (e.getCause() instanceof AuthFailureError) {
                mo53234a(16501);
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo53161b() {
        try {
            return (byte[]) aucu.m76783a(this.f95985a.mo52198a(new GetClientTokenRequest(new WalletCustomTheme())), 10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }
}
