package p000;

import com.google.android.gms.drive.DriveId;
import java.text.ParseException;
import java.util.Date;

/* renamed from: vci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vci extends vbk {

    /* renamed from: a */
    private static final sbw f49028a = new sbw("UpdatedDateMonitorProce", "");

    /* renamed from: b */
    private Date f49029b;

    public vci(vbh vbh, long j) {
        super(vbh);
        this.f49029b = new Date(j);
    }

    /* renamed from: a */
    public final DriveId mo28156a(uos uos, vkr vkr, boolean z) {
        String o = vkr.mo28580o();
        if (o != null) {
            try {
                Date a = uhc.m38504a(o);
                if (a.before(this.f49029b)) {
                    this.f49029b = a;
                }
            } catch (ParseException e) {
                f49028a.mo25378c("UpdatedDateMonitorProce", String.format("Error parsing date %s", o), e);
            }
        }
        return super.mo28156a(uos, vkr, z);
    }

    /* renamed from: a */
    public final Date mo28225a() {
        Date date = this.f49029b;
        if (date != null) {
            return new Date(date.getTime());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo28195a(String str) {
        if (str == null) {
            this.f49029b = null;
        }
        super.mo28195a(str);
    }
}
