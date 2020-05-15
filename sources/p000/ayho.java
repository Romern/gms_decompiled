package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.SendMessageResponse;

/* renamed from: ayho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayho extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97607c;

    /* renamed from: d */
    final /* synthetic */ String f97608d;

    /* renamed from: e */
    final /* synthetic */ String f97609e;

    /* renamed from: f */
    final /* synthetic */ byte[] f97610f;

    /* renamed from: g */
    final /* synthetic */ axue f97611g;

    /* renamed from: h */
    final /* synthetic */ ayja f97612h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayho(ayja ayja, String str, axrs axrs, String str2, String str3, byte[] bArr, axue axue) {
        super(str);
        this.f97612h = ayja;
        this.f97607c = axrs;
        this.f97608d = str2;
        this.f97609e = str3;
        this.f97610f = bArr;
        this.f97611g = axue;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo53991a() {
        String str;
        SendMessageResponse sendMessageResponse;
        try {
            axrs axrs = this.f97607c;
            String str2 = this.f97608d;
            String str3 = this.f97609e;
            byte[] bArr = this.f97610f;
            ayja ayja = this.f97612h;
            String str4 = null;
            if (ayak.m83694b(str2)) {
                axzf a = ayja.f97733l.mo60322a();
                if (a != null) {
                    if (Log.isLoggable("WearableService", 3)) {
                        String str5 = a.f96814a;
                        StringBuilder sb = new StringBuilder(str2.length() + 38 + String.valueOf(str5).length());
                        sb.append("sanitizeTarget: replaced target ");
                        sb.append(str2);
                        sb.append(" with ");
                        sb.append(str5);
                        Log.d("WearableService", sb.toString());
                    }
                    str4 = a.f96814a;
                } else if (Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", str2.length() == 0 ? new String("sanitizeTarget: no legacy peer, not sending to target ") : "sanitizeTarget: no legacy peer, not sending to target ".concat(str2));
                }
            } else {
                str4 = str2;
            }
            if (str4 != null) {
                ayai ayai = this.f97612h.f97732k;
                axue axue = this.f97611g;
                sdo.checkIfNull(axue, "appKey was null");
                sdo.checkIfNull((Object) str4, (Object) "target was null");
                sdo.checkIfNull((Object) str3, (Object) "action was null");
                axty.m83205b(5, axue.f96377a);
                int a2 = ayai.mo53831a(axue, str4, true, str3, bArr, null);
                if (a2 != -1) {
                    sendMessageResponse = new SendMessageResponse(0, a2);
                    axrs.mo53460a(sendMessageResponse);
                }
            }
            sendMessageResponse = new SendMessageResponse(4000, -1);
            axrs.mo53460a(sendMessageResponse);
        } catch (Exception e) {
            byte[] bArr2 = this.f97610f;
            if (bArr2 != null) {
                str = Integer.toString(bArr2.length);
            } else {
                str = "null";
            }
            String str6 = this.f97608d;
            String str7 = this.f97609e;
            StringBuilder sb2 = new StringBuilder(str6.length() + 61 + String.valueOf(str7).length() + String.valueOf(str).length());
            sb2.append("sendMessage: exception during processing: node ");
            sb2.append(str6);
            sb2.append(", path ");
            sb2.append(str7);
            sb2.append(", data ");
            sb2.append(str);
            Log.e("WearableService", sb2.toString(), e);
            this.f97607c.mo53460a(new SendMessageResponse(8, -1));
        }
    }
}
