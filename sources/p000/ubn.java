package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Debug;
import android.os.IBinder;
import com.google.android.cast.JGCastService;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import com.google.android.gms.drive.api.ApiChimeraService;
import com.google.android.gms.drive.internal.AddEventListenerRequest;
import com.google.android.gms.drive.internal.AddPermissionRequest;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;
import com.google.android.gms.drive.internal.CancelPendingActionsRequest;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import com.google.android.gms.drive.internal.CheckResourceIdsExistRequest;
import com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest;
import com.google.android.gms.drive.internal.CloseContentsRequest;
import com.google.android.gms.drive.internal.ControlProgressRequest;
import com.google.android.gms.drive.internal.CreateContentsRequest;
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.internal.CreateFolderRequest;
import com.google.android.gms.drive.internal.DeleteResourceRequest;
import com.google.android.gms.drive.internal.DisconnectRequest;
import com.google.android.gms.drive.internal.DriveServiceResponse;
import com.google.android.gms.drive.internal.FetchThumbnailRequest;
import com.google.android.gms.drive.internal.GetChangesRequest;
import com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest;
import com.google.android.gms.drive.internal.GetMetadataRequest;
import com.google.android.gms.drive.internal.GetPermissionsRequest;
import com.google.android.gms.drive.internal.ListParentsRequest;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;
import com.google.android.gms.drive.internal.OpenContentsRequest;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.internal.RemoveEventListenerRequest;
import com.google.android.gms.drive.internal.RemovePermissionRequest;
import com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;
import com.google.android.gms.drive.internal.SetResourceParentsRequest;
import com.google.android.gms.drive.internal.StreamContentsRequest;
import com.google.android.gms.drive.internal.TrashResourceRequest;
import com.google.android.gms.drive.internal.UnsubscribeResourceRequest;
import com.google.android.gms.drive.internal.UntrashResourceRequest;
import com.google.android.gms.drive.internal.UpdateMetadataRequest;
import com.google.android.gms.drive.internal.UpdatePermissionRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: ubn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubn extends utk implements IBinder.DeathRecipient, aaai {

    /* renamed from: a */
    public static final sbw f47167a = new sbw("DriveService", "");

    /* renamed from: b */
    public final ApiChimeraService f47168b;

    /* renamed from: c */
    public final aaag f47169c;

    /* renamed from: d */
    public final ubk f47170d;

    /* renamed from: e */
    public final List f47171e = new ArrayList();

    /* renamed from: f */
    public boolean f47172f;

    /* renamed from: g */
    private final ubq f47173g;

    /* renamed from: h */
    private final ubf f47174h;

    /* renamed from: i */
    private final aaac f47175i;

    /* renamed from: j */
    private final boolean f47176j;

    public ubn(ApiChimeraService apiChimeraService, aaag aaag, ubk ubk, ubf ubf, ubq ubq, aaac aaac, boolean z) {
        this.f47168b = apiChimeraService;
        this.f47169c = aaag;
        this.f47170d = ubk;
        this.f47173g = ubq;
        this.f47175i = aaac;
        this.f47174h = ubf;
        synchronized (ubf.f47118a) {
            ubf.f47118a.add(this);
        }
        this.f47176j = z;
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
    public final IntentSender mo27108a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
        int i;
        ubk ubk = this.f47170d;
        uey uey = ubk.f47143d;
        vcz vcz = ubk.f47156q;
        ApiChimeraService apiChimeraService = this.f47168b;
        sdo.m34971a(uey.mo27264a(EnumSet.of(twt.f46774c, twt.f46772a)), (Object) "Insufficient scopes");
        MetadataBundle metadataBundle = createFileIntentSenderRequest.f30830a;
        Integer num = createFileIntentSenderRequest.f30834e;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i2 = createFileIntentSenderRequest.f30831b;
        if (i == 0) {
            sdo.m34971a(i2 >= 0, (Object) "The request id must be provided.");
        }
        vdk d = ((vdd) vcz).mo28316d();
        d.mo28308i();
        d.mo28300c(0, 5);
        d.mo28282a(metadataBundle);
        d.mo28302d(i);
        DriveId driveId = createFileIntentSenderRequest.f30833d;
        String str = createFileIntentSenderRequest.f30832c;
        sdo.m34966a(uey, "app");
        Intent intent = new Intent();
        intent.setClassName(apiChimeraService, "com.google.android.gms.drive.ui.create.CreateFileActivityDelegate");
        intent.putExtra("accountName", uey.f47394a.f47682a);
        intent.putExtra("callerSdkAppId", uey.f47395b);
        intent.putExtra("callerPackageName", uey.f47396c.f30764b);
        intent.putExtra("metadata", metadataBundle);
        intent.putExtra("requestId", i2);
        intent.putExtra("selectedCollectionDriveId", driveId);
        intent.putExtra("dialogTitle", str);
        intent.putExtra("fileType", i);
        Set a = twt.m37571a(uey.f47398e);
        intent.putExtra("clientScopes", (String[]) a.toArray(new String[a.size()]));
        IntentSender intentSender = spn.m35844a(apiChimeraService, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY).getIntentSender();
        d.mo28307h();
        d.mo28274a();
        return intentSender;
    }

    /* renamed from: b */
    public final void mo27149b(QueryRequest queryRequest, uto uto) {
        this.f47169c.mo16658a(new uej(this.f47170d, queryRequest, uto));
    }

    public final void binderDied() {
        mo27148a(false);
    }

    /* renamed from: c */
    public final void mo27152c(uto uto) {
        this.f47169c.mo16658a(new udo(this.f47170d, uto));
    }

    /* renamed from: d */
    public final void mo27153d(uto uto) {
        this.f47169c.mo16658a(new udm(this.f47170d, uto));
    }

    /* renamed from: e */
    public final void mo27154e(uto uto) {
        this.f47169c.mo16658a(new udi(this.f47170d, uto));
    }

    /* renamed from: f */
    public final void mo27155f(uto uto) {
        this.f47169c.mo16658a(new udf(this.f47170d, uto));
    }

    /* renamed from: g */
    public final void mo27156g(uto uto) {
        this.f47169c.mo16658a(new udj(this.f47170d, uto));
    }

    /* renamed from: h */
    public final void mo27157h(uto uto) {
        this.f47169c.mo16658a(new udg(this.f47170d, this.f47173g, uto));
    }

    /* renamed from: b */
    public final void mo27150b(uto uto) {
        this.f47169c.mo16658a(new ueb(this.f47170d, uto, vpu.m41034a().f49763j));
    }

    /* renamed from: a */
    public final IntentSender mo27109a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
        ubk ubk = this.f47170d;
        return ubr.m38029a(this.f47168b, ubk.f47143d, openFileIntentSenderRequest, ubk.f47156q);
    }

    /* renamed from: a */
    public final DriveServiceResponse mo27110a(OpenContentsRequest openContentsRequest, uto uto) {
        udu udu = new udu(this.f47170d, this.f47173g, openContentsRequest, vpu.m41034a().f49748G, uto);
        this.f47169c.mo16658a(udu);
        return new DriveServiceResponse(udu.f47247f);
    }

    /* renamed from: a */
    public final DriveServiceResponse mo27111a(StreamContentsRequest streamContentsRequest, uto uto) {
        ueh ueh = new ueh(this.f47170d, this.f47173g, streamContentsRequest, vpu.m41034a().f49748G, uto);
        this.f47169c.mo16658a(ueh);
        return new DriveServiceResponse(ueh.f47247f);
    }

    /* renamed from: a */
    public final void mo27112a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, uto uto) {
        this.f47169c.mo16658a(new uek(this.f47170d, realtimeDocumentSyncRequest, uto));
    }

    /* renamed from: a */
    public final void mo27113a(AddEventListenerRequest addEventListenerRequest, utr utr, uto uto) {
        this.f47169c.mo16658a(new ucc(this.f47170d, addEventListenerRequest, utr, uto));
    }

    /* renamed from: a */
    public final void mo27114a(AddPermissionRequest addPermissionRequest, uto uto) {
        this.f47169c.mo16658a(new ucd(this.f47170d, addPermissionRequest, uto));
    }

    /* renamed from: a */
    public final void mo27115a(AuthorizeAccessRequest authorizeAccessRequest, uto uto) {
        this.f47169c.mo16658a(new uck(this.f47170d, authorizeAccessRequest, uto));
    }

    /* renamed from: a */
    public final void mo27116a(CancelPendingActionsRequest cancelPendingActionsRequest, uto uto) {
        this.f47169c.mo16658a(new ucl(this.f47170d, cancelPendingActionsRequest, uto));
    }

    /* renamed from: a */
    public final void mo27117a(ChangeResourceParentsRequest changeResourceParentsRequest, uto uto) {
        this.f47169c.mo16658a(new ucp(this.f47170d, changeResourceParentsRequest, uto));
    }

    /* renamed from: a */
    public final void mo27118a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, uto uto) {
        this.f47169c.mo16658a(new ucq(this.f47170d, checkResourceIdsExistRequest, uto));
    }

    /* renamed from: a */
    public final void mo27119a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, uto uto) {
        vpu a = vpu.m41034a();
        this.f47169c.mo16658a(new uct(this.f47170d, this.f47173g, a.f49769p, a.f49757d, a.f49768o, closeContentsAndUpdateMetadataRequest, uto));
    }

    /* renamed from: a */
    public final void mo27120a(CloseContentsRequest closeContentsRequest, uto uto) {
        Contents contents;
        Boolean bool = closeContentsRequest.f30824b;
        if (bool == null || !bool.booleanValue() || (contents = closeContentsRequest.f30823a) == null) {
            this.f47169c.mo16658a(new uda(this.f47170d, this.f47173g, closeContentsRequest, uto));
        } else {
            mo27119a(new CloseContentsAndUpdateMetadataRequest(contents.f30723d, MetadataBundle.m23056a(), null, false, null, 0, contents.f30721b, contents.f30724e, true), uto);
        }
    }

    /* renamed from: a */
    public final void mo27121a(ControlProgressRequest controlProgressRequest, uto uto) {
        this.f47169c.mo16658a(new ucv(this.f47170d, controlProgressRequest, uto));
    }

    /* renamed from: a */
    public final void mo27122a(CreateContentsRequest createContentsRequest, uto uto) {
        this.f47169c.mo16658a(new ucw(this.f47170d, this.f47173g, createContentsRequest, uto));
    }

    /* renamed from: a */
    public final void mo27123a(CreateFileRequest createFileRequest, uto uto) {
        this.f47169c.mo16658a(new ucx(this.f47170d, this.f47173g, vpu.m41034a().f49757d, createFileRequest, uto));
    }

    /* renamed from: a */
    public final void mo27124a(CreateFolderRequest createFolderRequest, uto uto) {
        this.f47169c.mo16658a(new ucy(this.f47170d, createFolderRequest, uto));
    }

    /* renamed from: a */
    public final void mo27125a(DeleteResourceRequest deleteResourceRequest, uto uto) {
        this.f47169c.mo16658a(new ucz(this.f47170d, deleteResourceRequest, uto));
    }

    /* renamed from: a */
    public final void mo27126a(DisconnectRequest disconnectRequest) {
        this.f47169c.mo16658a(new udb(this.f47170d, new ubl(), this));
    }

    /* renamed from: a */
    public final void mo27127a(FetchThumbnailRequest fetchThumbnailRequest, uto uto) {
        this.f47169c.mo16658a(new udd(this.f47170d, fetchThumbnailRequest, uto));
    }

    /* renamed from: a */
    public final void mo27128a(GetChangesRequest getChangesRequest, uto uto) {
        this.f47169c.mo16658a(new ude(this.f47170d, getChangesRequest, uto));
    }

    /* renamed from: a */
    public final void mo27129a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, uto uto) {
        this.f47169c.mo16658a(new udh(this.f47170d, getDriveIdFromUniqueIdentifierRequest, uto));
    }

    /* renamed from: a */
    public final void mo27130a(GetMetadataRequest getMetadataRequest, uto uto) {
        this.f47169c.mo16658a(new udk(this.f47170d, getMetadataRequest, uto));
    }

    /* renamed from: a */
    public final void mo27131a(GetPermissionsRequest getPermissionsRequest, uto uto) {
        this.f47169c.mo16658a(new udl(this.f47170d, getPermissionsRequest, uto));
    }

    /* renamed from: a */
    public final void mo27132a(ListParentsRequest listParentsRequest, uto uto) {
        this.f47169c.mo16658a(new udp(this.f47170d, listParentsRequest, uto));
    }

    /* renamed from: a */
    public final void mo27133a(LoadRealtimeRequest loadRealtimeRequest, uto uto) {
        aaag aaag = this.f47169c;
        ubk ubk = this.f47170d;
        aaag.mo16658a(new uds(ubk, this, loadRealtimeRequest, uto, ubk.f47150k));
    }

    /* renamed from: a */
    public final void mo27134a(QueryRequest queryRequest, uto uto) {
        this.f47169c.mo16658a(new udw(this.f47170d, queryRequest, uto));
    }

    /* renamed from: a */
    public final void mo27135a(QueryRequest queryRequest, utr utr, uto uto) {
        this.f47169c.mo16658a(new uef(this.f47170d, queryRequest, utr, uto));
    }

    /* renamed from: a */
    public final void mo27136a(RemoveEventListenerRequest removeEventListenerRequest, utr utr, uto uto) {
        this.f47169c.mo16658a(new udx(this.f47170d, removeEventListenerRequest, utr, uto));
    }

    /* renamed from: a */
    public final void mo27137a(RemovePermissionRequest removePermissionRequest, uto uto) {
        this.f47169c.mo16658a(new udy(this.f47170d, removePermissionRequest, uto));
    }

    /* renamed from: a */
    public final void mo27138a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, uto uto) {
        this.f47169c.mo16658a(new uec(this.f47170d, setFileUploadPreferencesRequest, uto));
    }

    /* renamed from: a */
    public final void mo27139a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, uto uto) {
        this.f47169c.mo16658a(new ued(this.f47170d, setPinnedDownloadPreferencesRequest, uto));
    }

    /* renamed from: a */
    public final void mo27140a(SetResourceParentsRequest setResourceParentsRequest, uto uto) {
        this.f47169c.mo16658a(new uee(this.f47170d, setResourceParentsRequest, uto));
    }

    /* renamed from: a */
    public final void mo27141a(TrashResourceRequest trashResourceRequest, uto uto) {
        this.f47169c.mo16658a(new uel(this.f47170d, trashResourceRequest, uto));
    }

    /* renamed from: a */
    public final void mo27142a(UnsubscribeResourceRequest unsubscribeResourceRequest, uto uto) {
        this.f47169c.mo16658a(new uem(this.f47170d, unsubscribeResourceRequest, uto));
    }

    /* renamed from: a */
    public final void mo27143a(UntrashResourceRequest untrashResourceRequest, uto uto) {
        this.f47169c.mo16658a(new uen(this.f47170d, untrashResourceRequest, uto));
    }

    /* renamed from: a */
    public final void mo27144a(UpdateMetadataRequest updateMetadataRequest, uto uto) {
        this.f47169c.mo16658a(new ueo(this.f47170d, updateMetadataRequest, uto));
    }

    /* renamed from: a */
    public final void mo27145a(UpdatePermissionRequest updatePermissionRequest, uto uto) {
        this.f47169c.mo16658a(new uep(this.f47170d, updatePermissionRequest, uto));
    }

    /* renamed from: a */
    public final void mo27146a(uto uto) {
        this.f47169c.mo16658a(new ucu(this.f47170d, uto));
    }

    /* renamed from: a */
    public final void mo27147a(utr utr, uto uto) {
        this.f47169c.mo16658a(new udz(this.f47170d, utr, uto));
    }

    /* renamed from: a */
    public final void mo27148a(boolean z) {
        try {
            this.f47170d.mo27102i();
            ubf ubf = this.f47174h;
            synchronized (ubf.f47118a) {
                ubf.f47118a.remove(this);
            }
            synchronized (this.f47171e) {
                for (ubw ubw : this.f47171e) {
                    ubw.mo27172a();
                }
                this.f47171e.clear();
                this.f47172f = true;
            }
            if (z) {
                this.f47175i.mo16655b(this);
            }
            if (this.f47176j) {
                Debug.stopMethodTracing();
            }
        } catch (Throwable th) {
            if (this.f47176j) {
                Debug.stopMethodTracing();
            }
            throw th;
        }
    }
}
