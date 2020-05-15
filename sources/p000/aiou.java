package p000;

import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.List;
import java.util.Locale;

/* renamed from: aiou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiou implements agbb {

    /* renamed from: a */
    final /* synthetic */ String f69374a;

    /* renamed from: b */
    final /* synthetic */ aiox f69375b;

    /* renamed from: c */
    final /* synthetic */ ahok f69376c;

    public aiou() {
    }

    /* renamed from: a */
    public final void mo23432a(int i) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiou", "a", 872, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Wifi LAN discovery stopped: %s", rjs.m33677c(i));
    }

    /* renamed from: b */
    public final void mo23438b() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiou", "b", 878, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Wifi LAN discovery failed to start with an unknown error");
    }

    public aiou(aiox aiox, String str, ahok ahok) {
        this.f69375b = aiox;
        this.f69374a = str;
        this.f69376c = ahok;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo23433a(int i, int i2) {
        String str;
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiou", "a", 888, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        switch (i2) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "ERROR_NOT_RESPONSE_MESSAGE";
                break;
            case 2:
                str = "ERROR_NO_ANSWERS";
                break;
            case 3:
                str = "ERROR_READING_RECORD_NAME";
                break;
            case 4:
                str = "ERROR_READING_A_RDATA";
                break;
            case 5:
                str = "ERROR_READING_AAAA_RDATA";
                break;
            case 6:
                str = "ERROR_READING_PTR_RDATA";
                break;
            case 7:
                str = "ERROR_SKIPPING_PTR_RDATA";
                break;
            case 8:
                str = "ERROR_READING_SRV_RDATA";
                break;
            case 9:
                str = "ERROR_SKIPPING_SRV_RDATA";
                break;
            case 10:
                str = "ERROR_READING_TXT_RDATA";
                break;
            case 11:
                str = "ERROR_SKIPPING_UNKNOWN_RECORD";
                break;
            case 12:
                str = "ERROR_END_OF_FILE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        bnsl.mo68413a("Failed to parse packet %d: %s", i, (Object) String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i2), str));
    }

    /* renamed from: b */
    public final void mo23439b(MdnsServiceInfo mdnsServiceInfo) {
        this.f69375b.mo37772a(new aion(this, this.f69374a, mdnsServiceInfo, this.f69376c));
    }

    /* renamed from: a */
    public final void mo23435a(MdnsServiceInfo mdnsServiceInfo) {
        this.f69375b.mo37772a(new aiom(this, this.f69374a, mdnsServiceInfo, this.f69376c));
    }

    /* renamed from: a */
    public final void mo23436a(String str) {
        this.f69375b.mo37772a(new aioo(this, this.f69374a, str, this.f69376c));
    }

    /* renamed from: a */
    public final void mo23437a(List list, int i) {
        srn srn = ailf.f69111a;
    }
}
