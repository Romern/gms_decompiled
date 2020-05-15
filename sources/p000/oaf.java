package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oaf implements ojn {

    /* renamed from: a */
    public final List f37038a = new ArrayList();

    /* renamed from: b */
    private final niw f37039b;

    /* renamed from: c */
    private final olo f37040c;

    /* renamed from: d */
    private final olr f37041d;

    /* renamed from: e */
    private final npd f37042e;

    /* renamed from: f */
    private final olt f37043f;

    /* renamed from: g */
    private final Context f37044g;

    /* renamed from: h */
    private final oae f37045h;

    /* renamed from: i */
    private final Handler f37046i;

    /* renamed from: j */
    private final nmx f37047j;

    public oaf(nmx nmx, niw niw, olo olo, olr olr, npd npd, olt olt, Context context, oae oae, Handler handler) {
        this.f37047j = nmx;
        this.f37039b = niw;
        this.f37040c = olo;
        this.f37041d = olr;
        this.f37042e = npd;
        this.f37043f = olt;
        this.f37044g = context;
        this.f37045h = oae;
        this.f37046i = handler;
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & 4) != 0) {
            bisc bisc = bivb.f121926d;
            if (bisc == null) {
                bisc = bisc.f121501f;
            }
            if (bisc.f121507e.size() != 0) {
                bisc bisc2 = bivb.f121926d;
                if (bisc2 == null) {
                    bisc2 = bisc.f121501f;
                }
                try {
                    bxwc<biwg> bxwc = bisc2.f121507e;
                    for (biwg biwg : bxwc) {
                        Point point = new Point();
                        if (oak.m28272a(biwg, point)) {
                            oak.m28273b(biwg, point);
                            if (point.x <= 0 || point.y <= 0) {
                                bpdn bpdn = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                                bpdo bpdo = bpdo.BAD_DISPLAY_RESOLUTION;
                                int i = point.x;
                                int i2 = point.y;
                                StringBuilder sb = new StringBuilder(45);
                                sb.append("wrong disp resolution ");
                                sb.append(i);
                                sb.append(",");
                                sb.append(i2);
                                throw new nlh(bpdn, bpdo, sb.toString());
                            }
                            int a = oak.m28269a(biwg);
                            if (a != 30) {
                                if (a != 60) {
                                    bpdn bpdn2 = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                                    bpdo bpdo2 = bpdo.BAD_FPS;
                                    StringBuilder sb2 = new StringBuilder(21);
                                    sb2.append("wrong FPS ");
                                    sb2.append(a);
                                    throw new nlh(bpdn2, bpdo2, sb2.toString());
                                }
                            }
                            if ((biwg.f122093a & 16) != 0) {
                                int i3 = biwg.f122098f;
                                if (i3 <= 0) {
                                    bpdn bpdn3 = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                                    bpdo bpdo3 = bpdo.BAD_DENSITY;
                                    StringBuilder sb3 = new StringBuilder(25);
                                    sb3.append("wrong density ");
                                    sb3.append(i3);
                                    throw new nlh(bpdn3, bpdo3, sb3.toString());
                                }
                            } else {
                                throw new nlh(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_DENSITY, "density missing");
                            }
                        } else {
                            bpdn bpdn4 = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                            bpdo bpdo4 = bpdo.BAD_CODEC_RESOLUTION;
                            biwf a2 = biwf.m102896a(biwg.f122094b);
                            if (a2 == null) {
                                a2 = biwf.VIDEO_800x480;
                            }
                            int i4 = a2.f122090j;
                            StringBuilder sb4 = new StringBuilder(34);
                            sb4.append("wrong codec resolution ");
                            sb4.append(i4);
                            throw new nlh(bpdn4, bpdo4, sb4.toString());
                        }
                    }
                    noe noe = this.f37047j.f36077a;
                    bnsn bnsn = noj.f36155b;
                    oak oak = new oak(noe, this.f37039b, this.f37040c, this.f37041d, this.f37042e, this.f37043f, this.f37044g, this.f37045h.mo21202a(), bxwc, birv.MEDIA_CODEC_VIDEO_H264_BP, this.f37046i);
                    this.f37038a.add(Pair.create(noe, oak));
                    return oak;
                } catch (nlh e) {
                    this.f37041d.mo21273a(e.f35951a, e.f35952b, e.getMessage() != null ? e.getMessage() : "CarErrorException");
                    return null;
                }
            }
        }
        return null;
    }
}
