package p000;

import android.content.Context;
import android.content.IntentSender;
import com.google.android.cast.JGCastService;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.p039ui.select.SelectFileChimeraActivity;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: ubr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubr {

    /* renamed from: a */
    private static final Filter f47191a = vfu.m40350a(vfu.m40352a(vgc.f49218b, "application/vnd.google-apps.folder"));

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.lang.Iterable):void
     arg types: [com.google.android.gms.drive.query.internal.Operator, java.util.ArrayList]
     candidates:
      com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.util.List):void
      com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.lang.Iterable):void */
    /* renamed from: a */
    public static IntentSender m38029a(Context context, uey uey, OpenFileIntentSenderRequest openFileIntentSenderRequest, vcz vcz) {
        Filter filter;
        int length;
        sdo.m34971a(uey.mo27264a(EnumSet.of(twt.f46774c, twt.f46772a)), (Object) "Insufficient scopes");
        DriveId driveId = openFileIntentSenderRequest.f30905c;
        String str = openFileIntentSenderRequest.f30903a;
        String[] strArr = openFileIntentSenderRequest.f30904b;
        FilterHolder filterHolder = openFileIntentSenderRequest.f30906d;
        LogicalFilter logicalFilter = null;
        if (filterHolder != null) {
            filter = filterHolder.f31112j;
        } else {
            filter = null;
        }
        if (strArr != null && (length = strArr.length) > 0) {
            ArrayList arrayList = new ArrayList(length);
            for (String str2 : strArr) {
                arrayList.add(vfu.m40352a(uzm.f48738N, str2));
            }
            sdo.m34966a(arrayList, "Filters may not be null");
            logicalFilter = new LogicalFilter(Operator.f31128g, (Iterable) arrayList);
        }
        if (logicalFilter == null || filter == null) {
            if (logicalFilter == null && filter == null) {
                filter = f47191a;
            } else if (logicalFilter != null) {
                filter = logicalFilter;
            }
            String str3 = uey.f47394a.f47682a;
            String str4 = uey.f47395b;
            String str5 = uey.f47396c.f30764b;
            vdk d = ((vdd) vcz).mo28316d();
            d.mo28308i();
            d.mo28300c(0, 15);
            vml a = SelectFileChimeraActivity.m23085a(context, str3, str4, str5);
            a.mo28640a(str);
            a.mo28639a(filter);
            a.mo28638a(driveId);
            a.mo28641a(true);
            IntentSender intentSender = spn.m35844a(context, a.f49526a, (int) JGCastService.FLAG_PRIVATE_DISPLAY).getIntentSender();
            d.mo28307h();
            d.mo28274a();
            return intentSender;
        }
        throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
    }
}
