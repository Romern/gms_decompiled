package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Map;

/* renamed from: shq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shq {

    /* renamed from: a */
    private static final C1245ok f44495a;

    /* renamed from: b */
    private static final C1245ok f44496b;

    /* renamed from: c */
    private static final C1245ok f44497c;

    static {
        C1245ok okVar = new C1245ok(60);
        f44495a = okVar;
        okVar.put(Integer.valueOf((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES), "Ads");
        f44495a.put(512, "Analytics");
        f44495a.put(768, "Android Auto");
        f44495a.put(1024, "Google Cloud");
        f44495a.put(1280, "Device Manager");
        f44495a.put(1536, "Location & Context");
        f44495a.put(1792, "Android Wear");
        f44495a.put(2048, "Android for Work");
        f44495a.put(2304, "Cast");
        f44495a.put(2560, "Core");
        f44495a.put(2816, "Drive");
        f44495a.put(3072, "Feedback");
        f44495a.put(3328, "Fit");
        f44495a.put(3584, "Games");
        f44495a.put(3840, "Help");
        f44495a.put(4096, "Identity");
        f44495a.put(4352, "Google Maps");
        f44495a.put(4608, "Metrics");
        f44495a.put(9728, "Nearby");
        f44495a.put(4864, "Nova");
        f44495a.put(5120, "Panorama");
        f44495a.put(5376, "Contacts");
        f44495a.put(8960, "Photos");
        f44495a.put(9216, "Plus");
        f44495a.put(5632, "Reminders");
        f44495a.put(5888, "Search");
        f44495a.put(6144, "Security");
        f44495a.put(6400, "Social");
        f44495a.put(6656, "Kids");
        f44495a.put(6912, "Google Wallet");
        f44495a.put(7168, "Android Pay");
        f44495a.put(7424, "App State");
        f44495a.put(7936, "Chrome Sync");
        f44495a.put(8192, "Brandmaster");
        f44495a.put(8448, "Subscribedfeeds");
        f44495a.put(8704, "Reporting");
        f44495a.put(9472, "Statements Service");
        f44495a.put(9984, "Tap and Pay");
        f44495a.put(10240, "Places");
        f44495a.put(10496, "Weave");
        f44495a.put(12288, "GassAdAttest");
        f44495a.put(12544, "ContextManager");
        f44495a.put(12800, "Icing");
        f44495a.put(13056, "Measurement");
        f44495a.put(13312, "Realtime");
        f44495a.put(13568, "WalletP2P");
        f44495a.put(17190912, "Clearcut Logs");
        f44495a.put(13824, "InstantApps");
        f44495a.put(14080, "Romanesco");
        f44495a.put(14592, "NetRec");
        f44495a.put(Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES), "Dynamic Links");
        f44495a.put(16640, "Constellation");
        f44495a.put(17152, "TelephonySpam");
        f44495a.put(17408, "App Preview Messages");
        f44495a.put(17664, "Gconnect");
        f44495a.put(17920, "LanguageProfile");
        f44495a.put(18176, "Growth");
        f44495a.put(18432, "Folsom");
        f44495a.put(18688, "Autofill");
        f44495a.put(20480, "FirebaseAuth");
        f44495a.put(20736, "IPA");
        f44495a.put(20992, "Pay");
        f44495a.put(21248, "SmartDevice");
        f44495a.put(21504, "reCAPTCHA");
        f44495a.put(21760, "GassProgram");
        f44495a.put(22016, "MDI Sync");
        f44495a.put(22272, "DeviceIntegrityToken");
        f44495a.put(22528, "MDI Download");
        f44495a.put(22784, "Mobile Data Hub");
        f44495a.put(24576, "Fonts Download");
        f44495a.put(24832, "Mobile Data Plan");
        f44495a.put(25088, "Mobile Subscription");
        f44495a.put(25344, "Auth Proximity");
        f44495a.put(25600, "Chimera Container");
        f44495a.put(25856, "Sign in");
        C1245ok okVar2 = new C1245ok(181);
        f44496b = okVar2;
        okVar2.put(257, "Ads preferences");
        f44496b.put(258, "Ads clear ID");
        f44496b.put(259, "Ads zero day fix");
        f44496b.put(260, "Ads Jumble negotiation");
        f44496b.put(261, "Ads ad request");
        f44496b.put(513, "Google Tag Manager");
        f44496b.put(1025, "Google Auth");
        f44496b.put(1036, "CredentialSyncAdapter");
        f44496b.put(1037, "CredentialStateSyncAdapter");
        f44496b.put(1039, "CryptauthGrpcClient");
        f44496b.put(1026, "Factory Reset Protection");
        f44496b.put(1027, "Smart Lock");
        f44496b.put(1028, "API proxy");
        f44496b.put(1029, "Backup");
        f44496b.put(1030, "Cloud Save");
        f44496b.put(1031, "Google Cloud Messaging");
        f44496b.put(1032, "Checkin");
        f44496b.put(1033, "OTA");
        f44496b.put(1034, "Smart device");
        f44496b.put(1035, "Cloud config");
        f44496b.put(1038, "CloudSaveSyncAdapter");
        f44496b.put(1537, "FLP");
        f44496b.put(1538, "ULR");
        f44496b.put(1539, "Activity Recognition");
        f44496b.put(1544, "Geocoding");
        f44496b.put(1540, "Context Manager");
        f44496b.put(1541, "Copresence");
        f44496b.put(1542, "Places");
        f44496b.put(1794, "Android Wear (JSON)");
        f44496b.put(1795, "Android Wear (GET)");
        f44496b.put(1796, "Android Wear (POST)");
        f44496b.put(1797, "Android Wear (Backup)");
        f44496b.put(1798, "Android Wear (gRPC)");
        f44496b.put(7425, "AppStateSyncAdapter");
        f44496b.put(18689, "AutoFill Prediction Data Sync");
        f44496b.put(7937, "Chromesync SyncAdapter");
        f44496b.put(7938, "Chromesync RPC");
        f44496b.put(2817, "DriveSyncAdapter");
        f44496b.put(2818, "DriveOpenConnection");
        f44496b.put(2819, "DriveServerGetThumbnailUrl");
        f44496b.put(2820, "DriveServerGetAccountMetadata");
        f44496b.put(2821, "DriveServerGetFolderColorPalette");
        f44496b.put(2822, "DriveServerGetAppDataFolderId");
        f44496b.put(2823, "DriveServerGetFullDriveFeed");
        f44496b.put(2824, "DriveServerGetFullPhotosFeed");
        f44496b.put(2825, "DriveServerGetQueryFeed");
        f44496b.put(2826, "DriveServerGetChangeLogFeed");
        f44496b.put(2827, "DriveServerGetFile");
        f44496b.put(2828, "DriveServerAuthorizeAppForFile");
        f44496b.put(2829, "DriveServerCreateFile");
        f44496b.put(2830, "DriveServerTrashResource");
        f44496b.put(2831, "DriveServerUntrashResource");
        f44496b.put(2832, "DriveServerDeleteResource");
        f44496b.put(2833, "DriveServerSetSubscribed");
        f44496b.put(2834, "DriveServerRemoveResourceParents");
        f44496b.put(2835, "DriveServerSetResourceParents");
        f44496b.put(2836, "DriveServerChangeResourceParents");
        f44496b.put(2837, "DriveServerUpdateMetadata");
        f44496b.put(2838, "DriveServerGetCallingSdkAppId");
        f44496b.put(2839, "DriveServerGenerateSingletonResourceId");
        f44496b.put(2840, "DriveServerAddPermission");
        f44496b.put(2841, "DriveServerUpdatePermission");
        f44496b.put(2842, "DriveServerDeletePermission");
        f44496b.put(3329, "FitnessSyncAdapter");
        f44496b.put(3585, "GamesSyncAdapter");
        f44496b.put(3586, "GamesStubSyncAdapter");
        f44496b.put(3841, "HelpMetrics");
        f44496b.put(3842, "HelpChatConversation");
        f44496b.put(3843, "HelpChatTypingStatus");
        f44496b.put(Integer.valueOf((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN), "User Data Controls");
        f44496b.put(4098, "AuthZen");
        f44496b.put(Integer.valueOf((int) FragmentTransaction.TRANSIT_FRAGMENT_FADE), "Sign-in");
        f44496b.put(4100, "Auth Proxy Api");
        f44496b.put(4102, "Account Settings Mobile");
        f44496b.put(4103, "Audit Recording");
        f44496b.put(4104, "Save Account Linking Token");
        f44496b.put(4105, "Service And Privacy Policy");
        f44496b.put(17409, "MatchstickSyncAdapter");
        f44496b.put(4609, "Clearcut/PlayLog");
        f44496b.put(4610, "Lockbox");
        f44496b.put(4611, "Phenotype");
        f44496b.put(9729, "Nearby Messages");
        f44496b.put(9730, "Nearby Messages heartbeat");
        f44496b.put(9731, "Nearby Discovery");
        f44496b.put(4865, "Nova Network Quality Lookup");
        f44496b.put(5377, "PeopleSyncAdapter");
        f44496b.put(5378, "ContactMetadata");
        f44496b.put(5379, "People Autocomplete");
        f44496b.put(5380, "FocusContactsSync");
        f44496b.put(5381, "FetchBackUpDeviceContactInfo");
        f44496b.put(5382, "RestoreBackedUpDeviceContacts");
        f44496b.put(14337, "ReachabilityDataSync");
        f44496b.put(5384, "IdentityGetByIdsOperation");
        f44496b.put(5385, "IdentityListOperation");
        f44496b.put(5386, "LoadCirclesOperation");
        f44496b.put(5387, "LoadMeOperation");
        f44496b.put(5388, "LoadPeopleLiveOperation");
        f44496b.put(5389, "SetAvatarOperation");
        f44496b.put(5390, "SetMeOperation");
        f44496b.put(5391, "AddCircleOperation");
        f44496b.put(5392, "AddPeopleToCircleOperation");
        f44496b.put(5393, "BlockPersonOperation");
        f44496b.put(5394, "LoadAddToCircleConsentOperation");
        f44496b.put(5395, "RemoveCircleOperation");
        f44496b.put(5396, "SetHasShownAddToCircleConsentOperation");
        f44496b.put(5397, "StarPersonOperation");
        f44496b.put(5398, "UpdateCircleOperation");
        f44496b.put(5399, "UpdatePersonCirclesOperation");
        f44496b.put(5400, "GetMeOperation");
        f44496b.put(5401, "People Apiary Server");
        f44496b.put(5402, "People Image Server");
        f44496b.put(5403, "Menagerie Sync");
        f44496b.put(5404, "People Data Layer");
        f44496b.put(5405, "People RequestSyncWithStatus API");
        f44496b.put(5406, "People GetSyncStatus API");
        f44496b.put(5407, "People TopN Ranked Targets API");
        f44496b.put(14081, "FetchBackUpDeviceContactInfo");
        f44496b.put(14082, "RestoreBackedUpDeviceContacts");
        f44496b.put(8961, "Photos InstantUploadSyncAdapter");
        f44496b.put(9217, "Plus OfflineActionSyncAdapter");
        f44496b.put(5633, "RemindersSyncAdapter");
        f44496b.put(8705, "ReportingSyncAdapter");
        f44496b.put(5889, "Action Intents");
        f44496b.put(5890, "App Indexing");
        f44496b.put(5891, "Icing");
        f44496b.put(6145, "Safety Net");
        f44496b.put(6146, "Attestation");
        f44496b.put(6147, "DroidGuard");
        f44496b.put(6148, "Safe Browsing Update");
        f44496b.put(6149, "Safe Browsing Query");
        f44496b.put(6150, "Android Device Manager");
        f44496b.put(6401, "Photos");
        f44496b.put(6402, "App Invite");
        f44496b.put(6403, "Google Unified Notification System");
        f44496b.put(6404, "Location (Social)");
        f44496b.put(6405, "Smart Profile");
        f44496b.put(8449, "subscribedfeeds SyncAdapter");
        f44496b.put(8450, "subscribedfeeds GMS SyncAdapter");
        f44496b.put(6657, "Kids Sync");
        f44496b.put(6658, "Unicorn Kids");
        f44496b.put(6913, "Wallet OCR");
        f44496b.put(10496, "Weave");
        f44496b.put(10497, "Weave.GcdSyncAdapter");
        f44496b.put(10498, "Weave.GcdSyncAdapterStub");
        f44496b.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_STARTED), "Default AbstractApiaryServer");
        f44496b.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED), "Default BaseApiaryServer");
        f44496b.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND), "Default BaseProtoServer");
        f44496b.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED), "Default BaseGrpcServer");
        f44496b.put(10241, "PlacesServer addPlace");
        f44496b.put(10242, "PlacesServer search");
        f44496b.put(10243, "PlacesServer getPlaceById");
        f44496b.put(10244, "PlacesServer getStandardAliases");
        f44496b.put(10245, "PlacesServer setAliases");
        f44496b.put(10272, "PlacesServer getNicknames");
        f44496b.put(10246, "PlacesServer getAutocompletePredictions");
        f44496b.put(10247, "PlacesServer getAutocompletePredictions (personalized)");
        f44496b.put(10248, "PlacesServer getPlaceInferenceData");
        f44496b.put(10249, "Beacon getInfoForObservedBeacons");
        f44496b.put(10254, "FIFE fetchImage");
        f44496b.put(10263, "GLS updateQuotaAccountingStatus");
        f44496b.put(10264, "PlacesServer getNearbyAlertDataById");
        f44496b.put(10265, "PlacesServer getPlaceByLatLng");
        f44496b.put(10266, "PlacesServer getPhotoMetadata");
        f44496b.put(10267, "PlacesServer deleteAlias");
        f44496b.put(10268, "PlacesServer countOperation");
        f44496b.put(10269, "PlacesServer getPlaceInferenceModelWeights");
        f44496b.put(10270, "PlacesServer getPersonalizedActivityModel");
        f44496b.put(10271, "PlacesServer getPersonalizedPlaces");
        f44496b.put(3073, "Feedback SendReport");
        f44496b.put(3074, "Feedback Suggestion");
        f44496b.put(12545, "Context Manager Register Device");
        f44496b.put(12546, "Context Manager Write Interests");
        f44496b.put(12547, "Context Manager Write Context");
        f44496b.put(12548, "Context Manager Write Feature");
        f44496b.put(12549, "Context Manager Get Acl");
        f44496b.put(12550, "Context Manager Read Footprints");
        f44496b.put(12551, "Context Manager Produce Context");
        f44496b.put(12552, "Context Manager Get Config");
        f44496b.put(12553, "Context Manager Ping");
        f44496b.put(12554, "Context Manager Read Server Fence Updates");
        f44496b.put(12555, "Context Manager Report Server Fence Results");
        f44496b.put(12801, "Icing App History Events");
        f44496b.put(12802, "Icing App Params");
        f44496b.put(12803, "Icing User Actions Upload");
        f44496b.put(12804, "Icing User Actions Deletions Download");
        f44496b.put(10273, "PlacesServer getUserPlaces");
        f44496b.put(10274, "PlacesServer searchByChain");
        f44496b.put(10275, "PlacesServer searchByBeacon");
        f44496b.put(10276, "PlacesServer searchByClient");
        f44496b.put(21505, "reCAPTCHA init");
        f44496b.put(21506, "reCAPTCHA execute");
        f44496b.put(22017, "Profile Sync");
        f44496b.put(24577, "Fonts Download");
        f44496b.put(24833, "Mobile Data Plan GTAF");
        f44496b.put(25089, "Mobile Subscription Identity");
        f44496b.put(21249, "Smart Device Magic Wand");
        f44496b.put(25345, "Auth Proximity Sync");
        f44496b.put(25601, "Chimera Container Zapp");
        f44496b.put(25857, "Signin Auth");
        C1245ok okVar3 = new C1245ok(38);
        f44497c = okVar3;
        okVar3.put(-255, "Download Manager");
        f44497c.put(-254, "Media Player");
        f44497c.put(-253, "Backup Transport");
        f44497c.put(289669121, "Create contacts gmail.com");
        f44497c.put(289669122, "Update contacts gmail.com");
        f44497c.put(289669123, "Delete contacts gmail.com");
        f44497c.put(289669124, "Photos contacts gmail.com");
        f44497c.put(306446337, "Create groups gmail.com");
        f44497c.put(306446338, "Update groups gmail.com");
        f44497c.put(306446339, "Delete groups gmail.com");
        f44497c.put(306446340, "Photos groups gmail.com");
        f44497c.put(558104577, "Create contacts dasher");
        f44497c.put(558104578, "Update contacts dasher");
        f44497c.put(558104579, "Delete contacts dasher");
        f44497c.put(558104580, "Photos contacts dasher");
        f44497c.put(574881793, "Create groups dasher");
        f44497c.put(574881794, "Update groups dasher");
        f44497c.put(574881795, "Delete groups dasher");
        f44497c.put(574881796, "Photos groups dasher");
        f44497c.put(826540033, "Create contacts google.com");
        f44497c.put(826540034, "Update contacts google.com");
        f44497c.put(826540035, "Delete contacts google.com");
        f44497c.put(826540036, "Photos contacts google.com");
        f44497c.put(843317249, "Create groups google.com");
        f44497c.put(843317250, "Update groups google.com");
        f44497c.put(843317251, "Delete groups google.com");
        f44497c.put(843317252, "Photos groups google.com");
        f44497c.put(273154049, "GAL Feed gmail.com");
        f44497c.put(273154050, "GAL Entry gmail.com");
        f44497c.put(273154051, "GAL File gmail.com");
        f44497c.put(541589505, "GAL Feed dasher");
        f44497c.put(541589506, "GAL Entry dasher");
        f44497c.put(541589507, "GAL File dasher");
        f44497c.put(810024961, "GAL Feed google.com");
        f44497c.put(810024962, "GAL Entry google.com");
        f44497c.put(810024963, "GAL File google.com");
        f44497c.put(1970300020, "OTA (Legacy)");
        f44497c.put(17195007, "Clearcut Logs");
    }

    /* renamed from: a */
    public static String m35306a(int i) {
        int c = m35309c(i);
        if (c >= 17190912 && c <= 17195007) {
            return (String) f44495a.get(17190912);
        }
        String str = (String) f44496b.get(Integer.valueOf(c));
        if (str == null && (str = (String) f44495a.get(Integer.valueOf(268435200 & i))) == null) {
            return (String) f44497c.get(Integer.valueOf(i));
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m35308b(int i) {
        int c = m35309c(i);
        return f44496b.containsKey(Integer.valueOf(c)) || f44495a.containsKey(Integer.valueOf(i & 268435200)) || (c >= 17190912 && c <= 17195007);
    }

    /* renamed from: c */
    public static int m35309c(int i) {
        return i & 268435455;
    }

    /* renamed from: d */
    public static int m35310d(int i) {
        return i >> 28;
    }

    /* renamed from: a */
    public static Map m35307a() {
        C1223np npVar = new C1223np(f44495a);
        npVar.mo8150a(f44496b);
        npVar.mo8150a(f44497c);
        npVar.put(0, "All traffic");
        return npVar;
    }
}
