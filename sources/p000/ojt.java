package p000;

import android.os.Handler;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.nio.ByteBuffer;

/* renamed from: ojt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ojt extends ojh {

    /* renamed from: a */
    public static final bnsn f37803a = odk.m28481a("CAR.GAL.RADIO-EP");

    /* renamed from: b */
    public final ojs f37804b;

    /* renamed from: c */
    private final Handler f37805c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojt(ojs ojs, ojm ojm) {
        super(15, ojs, ojm);
        Looper myLooper = Looper.myLooper();
        this.f37804b = ojs;
        this.f37805c = new adzt(myLooper, new ojr(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        Boolean bool;
        if (this.f37804b == null) {
            bnsi c = f37803a.mo68388c();
            c.mo68432a("ojt", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("callback is null, not handling message");
            return;
        }
        switch (i) {
            case 32769:
                bion bion = (bion) bxvk.m124012a(bion.f121069d, byteBuffer);
                if (bion != null) {
                    Handler handler = this.f37805c;
                    bisf a = bisf.m102781a(bion.f121071a);
                    if (a == null) {
                        a = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    int i2 = a.f121548F;
                    int i3 = bion.f121072b;
                    bity bity = bion.f121073c;
                    if (bity == null) {
                        bity = bity.f121743f;
                    }
                    handler.sendMessage(handler.obtainMessage(4, i2, i3, bity));
                    return;
                }
                bnsi b = f37803a.mo68387b();
                b.mo68432a("ojt", "a", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Wrong ActiveRadioNotification message");
                return;
            case 32770:
            case 32771:
            case 32773:
            case 32775:
            case 32777:
            case 32779:
            case 32782:
            case 32784:
            case 32787:
            case 32789:
            case 32791:
            default:
                return;
            case 32772:
                bivm bivm = (bivm) bxvk.m124012a(bivm.f122013c, byteBuffer);
                if (bivm != null) {
                    Handler handler2 = this.f37805c;
                    bisf a2 = bisf.m102781a(bivm.f122015a);
                    if (a2 == null) {
                        a2 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler2.sendMessage(handler2.obtainMessage(0, a2.f121548F, bivm.f122016b));
                    return;
                }
                bnsi b2 = f37803a.mo68387b();
                b2.mo68432a("ojt", "a", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Wrong StepChannelResponse message");
                return;
            case 32774:
                biun biun = (biun) bxvk.m124012a(biun.f121822c, byteBuffer);
                if (biun != null) {
                    Handler handler3 = this.f37805c;
                    bisf a3 = bisf.m102781a(biun.f121824a);
                    if (a3 == null) {
                        a3 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler3.sendMessage(handler3.obtainMessage(1, a3.f121548F, biun.f121825b));
                    return;
                }
                bnsi b3 = f37803a.mo68387b();
                b3.mo68432a("ojt", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("Wrong SeekStationResponse message");
                return;
            case 32776:
                biul biul = (biul) bxvk.m124012a(biul.f121808d, byteBuffer);
                if (biul != null) {
                    Handler handler4 = this.f37805c;
                    bisf a4 = bisf.m102781a(biul.f121810a);
                    if (a4 == null) {
                        a4 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler4.sendMessage(handler4.obtainMessage(3, a4.f121548F, biul.f121811b, Boolean.valueOf(biul.f121812c)));
                    return;
                }
                bnsi b4 = f37803a.mo68387b();
                b4.mo68432a("ojt", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68405a("Wrong ScanStationsResponse message");
                return;
            case 32778:
                bivy bivy = (bivy) bxvk.m124012a(bivy.f122059c, byteBuffer);
                if (bivy != null) {
                    Handler handler5 = this.f37805c;
                    bisf a5 = bisf.m102781a(bivy.f122061a);
                    if (a5 == null) {
                        a5 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler5.sendMessage(handler5.obtainMessage(2, a5.f121548F, bivy.f122062b));
                    return;
                }
                bnsi b5 = f37803a.mo68387b();
                b5.mo68432a("ojt", "a", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b5.mo68405a("Wrong TuneToStationResponse message");
                return;
            case 32780:
                biqq biqq = (biqq) bxvk.m124012a(biqq.f121317e, byteBuffer);
                if (biqq == null) {
                    bnsi b6 = f37803a.mo68387b();
                    b6.mo68432a("ojt", "a", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b6.mo68405a("Wrong GetProgramListResponse message");
                    return;
                }
                Handler handler6 = this.f37805c;
                handler6.sendMessage(handler6.obtainMessage(8, biqq));
                return;
            case 32781:
                bivk bivk = (bivk) bxvk.m124012a(bivk.f122002b, byteBuffer);
                if (bivk == null) {
                    bnsi b7 = f37803a.mo68387b();
                    b7.mo68432a("ojt", "a", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b7.mo68405a("Wrong StationPresetsNotification message");
                    return;
                }
                Handler handler7 = this.f37805c;
                handler7.sendMessage(handler7.obtainMessage(12, bivk));
                return;
            case 32783:
                bipn bipn = (bipn) bxvk.m124012a(bipn.f121186c, byteBuffer);
                if (bipn != null) {
                    Handler handler8 = this.f37805c;
                    bisf a6 = bisf.m102781a(bipn.f121188a);
                    if (a6 == null) {
                        a6 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler8.sendMessage(handler8.obtainMessage(6, a6.f121548F, bipn.f121189b));
                    return;
                }
                bnsi b8 = f37803a.mo68387b();
                b8.mo68432a("ojt", "a", 307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b8.mo68405a("Wrong CancelRadioOperationsResponse message");
                return;
            case 32785:
                bipw bipw = (bipw) bxvk.m124012a(bipw.f121226d, byteBuffer);
                if (bipw != null) {
                    Handler handler9 = this.f37805c;
                    bisf a7 = bisf.m102781a(bipw.f121228a);
                    if (a7 == null) {
                        a7 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler9.sendMessage(handler9.obtainMessage(11, a7.f121548F, bipw.f121229b, Integer.valueOf(bipw.f121230c)));
                    return;
                }
                bnsi b9 = f37803a.mo68387b();
                b9.mo68432a("ojt", "a", 317, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b9.mo68405a("Wrong ConfigureChannelSpacingResponse message");
                return;
            case 32786:
                bitz bitz = (bitz) bxvk.m124012a(bitz.f121751c, byteBuffer);
                if (bitz != null) {
                    Handler handler10 = this.f37805c;
                    int i4 = bitz.f121753a;
                    bity bity2 = bitz.f121754b;
                    if (bity2 == null) {
                        bity2 = bity.f121743f;
                    }
                    handler10.sendMessage(handler10.obtainMessage(5, i4, -1, bity2));
                    return;
                }
                bnsi b10 = f37803a.mo68387b();
                b10.mo68432a("ojt", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b10.mo68405a("Wrong RadioStationInfoNotification message");
                return;
            case 32788:
                bisj bisj = (bisj) bxvk.m124012a(bisj.f121569d, byteBuffer);
                if (bisj != null) {
                    Handler handler11 = this.f37805c;
                    bisf a8 = bisf.m102781a(bisj.f121571a);
                    if (a8 == null) {
                        a8 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler11.sendMessage(handler11.obtainMessage(9, a8.f121548F, bisj.f121572b, Boolean.valueOf(bisj.f121573c)));
                    return;
                }
                bnsi b11 = f37803a.mo68387b();
                b11.mo68432a("ojt", "a", 347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b11.mo68405a("Wrong MuteRadioResponse message");
                return;
            case 32790:
                biqs biqs = (biqs) bxvk.m124012a(biqs.f121330d, byteBuffer);
                if (biqs != null) {
                    bivu[] bivuArr = new bivu[biqs.f121334c.size()];
                    Handler handler12 = this.f37805c;
                    bisf a9 = bisf.m102781a(biqs.f121332a);
                    if (a9 == null) {
                        a9 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    handler12.sendMessage(handler12.obtainMessage(7, a9.f121548F, biqs.f121333b, biqs.f121334c.toArray(bivuArr)));
                    return;
                }
                bnsi b12 = f37803a.mo68387b();
                b12.mo68432a("ojt", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b12.mo68405a("Wrong GetTrafficUpdateResponse message");
                return;
            case 32792:
                bitw bitw = (bitw) bxvk.m124012a(bitw.f121727d, byteBuffer);
                if (bitw != null) {
                    Handler handler13 = this.f37805c;
                    bisf a10 = bisf.m102781a(bitw.f121730b);
                    if (a10 == null) {
                        a10 = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    int i5 = a10.f121548F;
                    if ((bitw.f121729a & 2) != 0) {
                        bool = Boolean.valueOf(bitw.f121731c);
                    } else {
                        bool = null;
                    }
                    handler13.sendMessage(handler13.obtainMessage(10, i5, -1, bool));
                    return;
                }
                bnsi b13 = f37803a.mo68387b();
                b13.mo68432a("ojt", "a", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b13.mo68405a("Wrong RadioSourceResponse message");
                return;
            case 32793:
                bitx bitx = (bitx) bxvk.m124012a(bitx.f121733g, byteBuffer);
                if (bitx == null) {
                    bnsi b14 = f37803a.mo68387b();
                    b14.mo68432a("ojt", "a", 357, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b14.mo68405a("Wrong RadioStateNotification message");
                    return;
                }
                Handler handler14 = this.f37805c;
                handler14.sendMessage(handler14.obtainMessage(13, bitx));
                return;
        }
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }
}
