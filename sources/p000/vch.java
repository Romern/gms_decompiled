package p000;

import android.content.SyncResult;
import com.google.android.gms.drive.DriveId;

/* renamed from: vch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vch implements vbh {

    /* renamed from: a */
    private final SyncResult f49026a;

    /* renamed from: b */
    private boolean f49027b = false;

    public vch(SyncResult syncResult) {
        this.f49026a = syncResult;
    }

    /* renamed from: a */
    public final DriveId mo28156a(uos uos, vkr vkr, boolean z) {
        if (vkr.mo28568c()) {
            DriveId a = vbf.m39919a(uos, vkr);
            this.f49026a.stats.numEntries++;
            this.f49026a.stats.numDeletes++;
            return a;
        }
        DriveId a2 = vbf.m39920a(uos, vkr, z);
        this.f49026a.stats.numInserts++;
        this.f49026a.stats.numEntries++;
        return a2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo28194a(long j) {
        sdo.m34971a(!this.f49027b, (Object) "Already started");
        this.f49027b = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo28195a(String str) {
        sdo.m34971a(this.f49027b, (Object) "Not started yet");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo28192a(uos uos) {
        sdo.m34971a(this.f49027b, (Object) "Not started yet");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo28193a(uos uos, vkw vkw) {
        sdo.m34971a(this.f49027b, (Object) "Not started yet");
    }
}
