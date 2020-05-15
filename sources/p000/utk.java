package p000;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
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

/* renamed from: utk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class utk extends dck implements utl {
    public utk() {
        super("com.google.android.gms.drive.internal.IDriveService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        utr utr;
        utr utr2;
        utr utr3;
        utr utr4;
        uto uto = null;
        switch (i) {
            case 1:
                GetMetadataRequest getMetadataRequest = (GetMetadataRequest) dcl.m8163a(parcel, GetMetadataRequest.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface instanceof uto) {
                        uto = (uto) queryLocalInterface;
                    } else {
                        uto = new utm(readStrongBinder);
                    }
                }
                mo27130a(getMetadataRequest, uto);
                parcel2.writeNoException();
                return true;
            case 2:
                QueryRequest queryRequest = (QueryRequest) dcl.m8163a(parcel, QueryRequest.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    uto = queryLocalInterface2 instanceof uto ? (uto) queryLocalInterface2 : new utm(readStrongBinder2);
                }
                mo27134a(queryRequest, uto);
                parcel2.writeNoException();
                return true;
            case 3:
                UpdateMetadataRequest updateMetadataRequest = (UpdateMetadataRequest) dcl.m8163a(parcel, UpdateMetadataRequest.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface3 instanceof uto) {
                        uto = (uto) queryLocalInterface3;
                    } else {
                        uto = new utm(readStrongBinder3);
                    }
                }
                mo27144a(updateMetadataRequest, uto);
                parcel2.writeNoException();
                return true;
            case 4:
                CreateContentsRequest createContentsRequest = (CreateContentsRequest) dcl.m8163a(parcel, CreateContentsRequest.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface4 instanceof uto) {
                        uto = (uto) queryLocalInterface4;
                    } else {
                        uto = new utm(readStrongBinder4);
                    }
                }
                mo27122a(createContentsRequest, uto);
                parcel2.writeNoException();
                return true;
            case 5:
                CreateFileRequest createFileRequest = (CreateFileRequest) dcl.m8163a(parcel, CreateFileRequest.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface5 instanceof uto) {
                        uto = (uto) queryLocalInterface5;
                    } else {
                        uto = new utm(readStrongBinder5);
                    }
                }
                mo27123a(createFileRequest, uto);
                parcel2.writeNoException();
                return true;
            case 6:
                CreateFolderRequest createFolderRequest = (CreateFolderRequest) dcl.m8163a(parcel, CreateFolderRequest.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface6 instanceof uto) {
                        uto = (uto) queryLocalInterface6;
                    } else {
                        uto = new utm(readStrongBinder6);
                    }
                }
                mo27124a(createFolderRequest, uto);
                parcel2.writeNoException();
                return true;
            case 7:
                OpenContentsRequest openContentsRequest = (OpenContentsRequest) dcl.m8163a(parcel, OpenContentsRequest.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface7 instanceof uto) {
                        uto = (uto) queryLocalInterface7;
                    } else {
                        uto = new utm(readStrongBinder7);
                    }
                }
                DriveServiceResponse a = mo27110a(openContentsRequest, uto);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 8:
                CloseContentsRequest closeContentsRequest = (CloseContentsRequest) dcl.m8163a(parcel, CloseContentsRequest.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface8 instanceof uto) {
                        uto = (uto) queryLocalInterface8;
                    } else {
                        uto = new utm(readStrongBinder8);
                    }
                }
                mo27120a(closeContentsRequest, uto);
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface9 instanceof uto) {
                        uto = (uto) queryLocalInterface9;
                    } else {
                        uto = new utm(readStrongBinder9);
                    }
                }
                mo27150b(uto);
                parcel2.writeNoException();
                return true;
            case 10:
                IntentSender a2 = mo27109a((OpenFileIntentSenderRequest) dcl.m8163a(parcel, OpenFileIntentSenderRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                return true;
            case 11:
                IntentSender a3 = mo27108a((CreateFileIntentSenderRequest) dcl.m8163a(parcel, CreateFileIntentSenderRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                return true;
            case 12:
                AuthorizeAccessRequest authorizeAccessRequest = (AuthorizeAccessRequest) dcl.m8163a(parcel, AuthorizeAccessRequest.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface10 instanceof uto) {
                        uto = (uto) queryLocalInterface10;
                    } else {
                        uto = new utm(readStrongBinder10);
                    }
                }
                mo27115a(authorizeAccessRequest, uto);
                parcel2.writeNoException();
                return true;
            case 13:
                ListParentsRequest listParentsRequest = (ListParentsRequest) dcl.m8163a(parcel, ListParentsRequest.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface11 instanceof uto) {
                        uto = (uto) queryLocalInterface11;
                    } else {
                        uto = new utm(readStrongBinder11);
                    }
                }
                mo27132a(listParentsRequest, uto);
                parcel2.writeNoException();
                return true;
            case 14:
                AddEventListenerRequest addEventListenerRequest = (AddEventListenerRequest) dcl.m8163a(parcel, AddEventListenerRequest.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
                    utr = queryLocalInterface12 instanceof utr ? (utr) queryLocalInterface12 : new utp(readStrongBinder12);
                } else {
                    utr = null;
                }
                parcel.readString();
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface13 instanceof uto) {
                        uto = (uto) queryLocalInterface13;
                    } else {
                        uto = new utm(readStrongBinder13);
                    }
                }
                mo27113a(addEventListenerRequest, utr, uto);
                parcel2.writeNoException();
                return true;
            case 15:
                RemoveEventListenerRequest removeEventListenerRequest = (RemoveEventListenerRequest) dcl.m8163a(parcel, RemoveEventListenerRequest.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
                    utr2 = queryLocalInterface14 instanceof utr ? (utr) queryLocalInterface14 : new utp(readStrongBinder14);
                } else {
                    utr2 = null;
                }
                parcel.readString();
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface15 instanceof uto) {
                        uto = (uto) queryLocalInterface15;
                    } else {
                        uto = new utm(readStrongBinder15);
                    }
                }
                mo27136a(removeEventListenerRequest, utr2, uto);
                parcel2.writeNoException();
                return true;
            case 16:
                mo27126a((DisconnectRequest) dcl.m8163a(parcel, DisconnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                TrashResourceRequest trashResourceRequest = (TrashResourceRequest) dcl.m8163a(parcel, TrashResourceRequest.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface16 instanceof uto) {
                        uto = (uto) queryLocalInterface16;
                    } else {
                        uto = new utm(readStrongBinder16);
                    }
                }
                mo27141a(trashResourceRequest, uto);
                parcel2.writeNoException();
                return true;
            case 18:
                CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest = (CloseContentsAndUpdateMetadataRequest) dcl.m8163a(parcel, CloseContentsAndUpdateMetadataRequest.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface17 instanceof uto) {
                        uto = (uto) queryLocalInterface17;
                    } else {
                        uto = new utm(readStrongBinder17);
                    }
                }
                mo27119a(closeContentsAndUpdateMetadataRequest, uto);
                parcel2.writeNoException();
                return true;
            case 19:
                QueryRequest queryRequest2 = (QueryRequest) dcl.m8163a(parcel, QueryRequest.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface18 instanceof uto) {
                        uto = (uto) queryLocalInterface18;
                    } else {
                        uto = new utm(readStrongBinder18);
                    }
                }
                mo27149b(queryRequest2, uto);
                parcel2.writeNoException();
                return true;
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case FelicaException.TYPE_USED_BY_OTHER_APP:
            case FelicaException.TYPE_PUSH_FAILED:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
            default:
                return false;
            case 24:
                DeleteResourceRequest deleteResourceRequest = (DeleteResourceRequest) dcl.m8163a(parcel, DeleteResourceRequest.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface19 instanceof uto) {
                        uto = (uto) queryLocalInterface19;
                    } else {
                        uto = new utm(readStrongBinder19);
                    }
                }
                mo27125a(deleteResourceRequest, uto);
                parcel2.writeNoException();
                return true;
            case 27:
                LoadRealtimeRequest loadRealtimeRequest = (LoadRealtimeRequest) dcl.m8163a(parcel, LoadRealtimeRequest.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface20 instanceof uto) {
                        uto = (uto) queryLocalInterface20;
                    } else {
                        uto = new utm(readStrongBinder20);
                    }
                }
                mo27133a(loadRealtimeRequest, uto);
                parcel2.writeNoException();
                return true;
            case 28:
                SetResourceParentsRequest setResourceParentsRequest = (SetResourceParentsRequest) dcl.m8163a(parcel, SetResourceParentsRequest.CREATOR);
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface21 instanceof uto) {
                        uto = (uto) queryLocalInterface21;
                    } else {
                        uto = new utm(readStrongBinder21);
                    }
                }
                mo27140a(setResourceParentsRequest, uto);
                parcel2.writeNoException();
                return true;
            case 29:
                GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest = (GetDriveIdFromUniqueIdentifierRequest) dcl.m8163a(parcel, GetDriveIdFromUniqueIdentifierRequest.CREATOR);
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface22 instanceof uto) {
                        uto = (uto) queryLocalInterface22;
                    } else {
                        uto = new utm(readStrongBinder22);
                    }
                }
                mo27129a(getDriveIdFromUniqueIdentifierRequest, uto);
                parcel2.writeNoException();
                return true;
            case 30:
                CheckResourceIdsExistRequest checkResourceIdsExistRequest = (CheckResourceIdsExistRequest) dcl.m8163a(parcel, CheckResourceIdsExistRequest.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface23 instanceof uto) {
                        uto = (uto) queryLocalInterface23;
                    } else {
                        uto = new utm(readStrongBinder23);
                    }
                }
                mo27118a(checkResourceIdsExistRequest, uto);
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface24 instanceof uto) {
                        uto = (uto) queryLocalInterface24;
                    } else {
                        uto = new utm(readStrongBinder24);
                    }
                }
                mo27146a(uto);
                parcel2.writeNoException();
                return true;
            case 32:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface25 instanceof uto) {
                        uto = (uto) queryLocalInterface25;
                    } else {
                        uto = new utm(readStrongBinder25);
                    }
                }
                mo27153d(uto);
                parcel2.writeNoException();
                return true;
            case 33:
                SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest = (SetPinnedDownloadPreferencesRequest) dcl.m8163a(parcel, SetPinnedDownloadPreferencesRequest.CREATOR);
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface26 instanceof uto) {
                        uto = (uto) queryLocalInterface26;
                    } else {
                        uto = new utm(readStrongBinder26);
                    }
                }
                mo27139a(setPinnedDownloadPreferencesRequest, uto);
                parcel2.writeNoException();
                return true;
            case 34:
                RealtimeDocumentSyncRequest realtimeDocumentSyncRequest = (RealtimeDocumentSyncRequest) dcl.m8163a(parcel, RealtimeDocumentSyncRequest.CREATOR);
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface27 instanceof uto) {
                        uto = (uto) queryLocalInterface27;
                    } else {
                        uto = new utm(readStrongBinder27);
                    }
                }
                mo27112a(realtimeDocumentSyncRequest, uto);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface28 instanceof uto) {
                        uto = (uto) queryLocalInterface28;
                    } else {
                        uto = new utm(readStrongBinder28);
                    }
                }
                mo27154e(uto);
                parcel2.writeNoException();
                return true;
            case 36:
                SetFileUploadPreferencesRequest setFileUploadPreferencesRequest = (SetFileUploadPreferencesRequest) dcl.m8163a(parcel, SetFileUploadPreferencesRequest.CREATOR);
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface29 instanceof uto) {
                        uto = (uto) queryLocalInterface29;
                    } else {
                        uto = new utm(readStrongBinder29);
                    }
                }
                mo27138a(setFileUploadPreferencesRequest, uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_NOT_CLOSED:
                CancelPendingActionsRequest cancelPendingActionsRequest = (CancelPendingActionsRequest) dcl.m8163a(parcel, CancelPendingActionsRequest.CREATOR);
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface30 instanceof uto) {
                        uto = (uto) queryLocalInterface30;
                    } else {
                        uto = new utm(readStrongBinder30);
                    }
                }
                mo27116a(cancelPendingActionsRequest, uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                UntrashResourceRequest untrashResourceRequest = (UntrashResourceRequest) dcl.m8163a(parcel, UntrashResourceRequest.CREATOR);
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface31 instanceof uto) {
                        uto = (uto) queryLocalInterface31;
                    } else {
                        uto = new utm(readStrongBinder31);
                    }
                }
                mo27143a(untrashResourceRequest, uto);
                parcel2.writeNoException();
                return true;
            case 41:
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface32 instanceof uto) {
                        uto = (uto) queryLocalInterface32;
                    } else {
                        uto = new utm(readStrongBinder32);
                    }
                }
                mo27152c(uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                FetchThumbnailRequest fetchThumbnailRequest = (FetchThumbnailRequest) dcl.m8163a(parcel, FetchThumbnailRequest.CREATOR);
                IBinder readStrongBinder33 = parcel.readStrongBinder();
                if (readStrongBinder33 != null) {
                    IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface33 instanceof uto) {
                        uto = (uto) queryLocalInterface33;
                    } else {
                        uto = new utm(readStrongBinder33);
                    }
                }
                mo27127a(fetchThumbnailRequest, uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                IBinder readStrongBinder34 = parcel.readStrongBinder();
                if (readStrongBinder34 != null) {
                    IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface34 instanceof uto) {
                        uto = (uto) queryLocalInterface34;
                    } else {
                        uto = new utm(readStrongBinder34);
                    }
                }
                mo27155f(uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_RESET_FAILED:
                GetChangesRequest getChangesRequest = (GetChangesRequest) dcl.m8163a(parcel, GetChangesRequest.CREATOR);
                IBinder readStrongBinder35 = parcel.readStrongBinder();
                if (readStrongBinder35 != null) {
                    IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface35 instanceof uto) {
                        uto = (uto) queryLocalInterface35;
                    } else {
                        uto = new utm(readStrongBinder35);
                    }
                }
                mo27128a(getChangesRequest, uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                UnsubscribeResourceRequest unsubscribeResourceRequest = (UnsubscribeResourceRequest) dcl.m8163a(parcel, UnsubscribeResourceRequest.CREATOR);
                IBinder readStrongBinder36 = parcel.readStrongBinder();
                if (readStrongBinder36 != null) {
                    IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface36 instanceof uto) {
                        uto = (uto) queryLocalInterface36;
                    } else {
                        uto = new utm(readStrongBinder36);
                    }
                }
                mo27142a(unsubscribeResourceRequest, uto);
                parcel2.writeNoException();
                return true;
            case 47:
                GetPermissionsRequest getPermissionsRequest = (GetPermissionsRequest) dcl.m8163a(parcel, GetPermissionsRequest.CREATOR);
                IBinder readStrongBinder37 = parcel.readStrongBinder();
                if (readStrongBinder37 != null) {
                    IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface37 instanceof uto) {
                        uto = (uto) queryLocalInterface37;
                    } else {
                        uto = new utm(readStrongBinder37);
                    }
                }
                mo27131a(getPermissionsRequest, uto);
                parcel2.writeNoException();
                return true;
            case 48:
                AddPermissionRequest addPermissionRequest = (AddPermissionRequest) dcl.m8163a(parcel, AddPermissionRequest.CREATOR);
                IBinder readStrongBinder38 = parcel.readStrongBinder();
                if (readStrongBinder38 != null) {
                    IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface38 instanceof uto) {
                        uto = (uto) queryLocalInterface38;
                    } else {
                        uto = new utm(readStrongBinder38);
                    }
                }
                mo27114a(addPermissionRequest, uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                UpdatePermissionRequest updatePermissionRequest = (UpdatePermissionRequest) dcl.m8163a(parcel, UpdatePermissionRequest.CREATOR);
                IBinder readStrongBinder39 = parcel.readStrongBinder();
                if (readStrongBinder39 != null) {
                    IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface39 instanceof uto) {
                        uto = (uto) queryLocalInterface39;
                    } else {
                        uto = new utm(readStrongBinder39);
                    }
                }
                mo27145a(updatePermissionRequest, uto);
                parcel2.writeNoException();
                return true;
            case 50:
                RemovePermissionRequest removePermissionRequest = (RemovePermissionRequest) dcl.m8163a(parcel, RemovePermissionRequest.CREATOR);
                IBinder readStrongBinder40 = parcel.readStrongBinder();
                if (readStrongBinder40 != null) {
                    IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface40 instanceof uto) {
                        uto = (uto) queryLocalInterface40;
                    } else {
                        uto = new utm(readStrongBinder40);
                    }
                }
                mo27137a(removePermissionRequest, uto);
                parcel2.writeNoException();
                return true;
            case 51:
                QueryRequest queryRequest3 = (QueryRequest) dcl.m8163a(parcel, QueryRequest.CREATOR);
                IBinder readStrongBinder41 = parcel.readStrongBinder();
                if (readStrongBinder41 != null) {
                    IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
                    utr3 = queryLocalInterface41 instanceof utr ? (utr) queryLocalInterface41 : new utp(readStrongBinder41);
                } else {
                    utr3 = null;
                }
                IBinder readStrongBinder42 = parcel.readStrongBinder();
                if (readStrongBinder42 != null) {
                    IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface42 instanceof uto) {
                        uto = (uto) queryLocalInterface42;
                    } else {
                        uto = new utm(readStrongBinder42);
                    }
                }
                mo27135a(queryRequest3, utr3, uto);
                parcel2.writeNoException();
                return true;
            case 52:
                IBinder readStrongBinder43 = parcel.readStrongBinder();
                if (readStrongBinder43 != null) {
                    IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
                    utr4 = queryLocalInterface43 instanceof utr ? (utr) queryLocalInterface43 : new utp(readStrongBinder43);
                } else {
                    utr4 = null;
                }
                IBinder readStrongBinder44 = parcel.readStrongBinder();
                if (readStrongBinder44 != null) {
                    IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface44 instanceof uto) {
                        uto = (uto) queryLocalInterface44;
                    } else {
                        uto = new utm(readStrongBinder44);
                    }
                }
                mo27147a(utr4, uto);
                parcel2.writeNoException();
                return true;
            case 53:
                ControlProgressRequest controlProgressRequest = (ControlProgressRequest) dcl.m8163a(parcel, ControlProgressRequest.CREATOR);
                IBinder readStrongBinder45 = parcel.readStrongBinder();
                if (readStrongBinder45 != null) {
                    IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface45 instanceof uto) {
                        uto = (uto) queryLocalInterface45;
                    } else {
                        uto = new utm(readStrongBinder45);
                    }
                }
                mo27121a(controlProgressRequest, uto);
                parcel2.writeNoException();
                return true;
            case 54:
                IBinder readStrongBinder46 = parcel.readStrongBinder();
                if (readStrongBinder46 != null) {
                    IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface46 instanceof uto) {
                        uto = (uto) queryLocalInterface46;
                    } else {
                        uto = new utm(readStrongBinder46);
                    }
                }
                mo27156g(uto);
                parcel2.writeNoException();
                return true;
            case 55:
                ChangeResourceParentsRequest changeResourceParentsRequest = (ChangeResourceParentsRequest) dcl.m8163a(parcel, ChangeResourceParentsRequest.CREATOR);
                IBinder readStrongBinder47 = parcel.readStrongBinder();
                if (readStrongBinder47 != null) {
                    IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface47 instanceof uto) {
                        uto = (uto) queryLocalInterface47;
                    } else {
                        uto = new utm(readStrongBinder47);
                    }
                }
                mo27117a(changeResourceParentsRequest, uto);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                StreamContentsRequest streamContentsRequest = (StreamContentsRequest) dcl.m8163a(parcel, StreamContentsRequest.CREATOR);
                IBinder readStrongBinder48 = parcel.readStrongBinder();
                if (readStrongBinder48 != null) {
                    IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface48 instanceof uto) {
                        uto = (uto) queryLocalInterface48;
                    } else {
                        uto = new utm(readStrongBinder48);
                    }
                }
                DriveServiceResponse a4 = mo27111a(streamContentsRequest, uto);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a4);
                return true;
            case 57:
                IBinder readStrongBinder49 = parcel.readStrongBinder();
                if (readStrongBinder49 != null) {
                    IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (queryLocalInterface49 instanceof uto) {
                        uto = (uto) queryLocalInterface49;
                    } else {
                        uto = new utm(readStrongBinder49);
                    }
                }
                mo27157h(uto);
                parcel2.writeNoException();
                return true;
        }
    }
}
