package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: byug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byug implements bxvp {
    UNKNOWN_APPLICATION(0),
    GPLUS(1),
    GPLUS_WEB(ErrorInfo.TYPE_SDU_UNKNOWN),
    GPLUS_ARES_FEATURE_PROVIDER(694),
    GPLUS_PHOTOS(2),
    GPLUS_HANGOUT(3),
    GPLUS_EVENTS(4),
    GPLUS_SQUARES(5),
    GPLUS_NOTIFICATIONS(6),
    GPLUS_GAMES(7),
    GPLUS_WHATS_HOT(8),
    GPLUS_LOCAL(9),
    GPLUS_PLUS_PAGES(10),
    GPLUS_PLUS_PAGES_RSS(198),
    GPLUS_PROFILE(11),
    GPLUS_FIND_PEOPLE(12),
    GPLUS_PHOTO_EDITOR(13),
    GPLUS_SOCIALCAST(14),
    GPLUS_INTERACTION_EVENTS(591),
    GPLUS_ENTITY_TRANSFER(660),
    GPLUS_LIS(687),
    GPLUS_DRAWBRIDGE(702),
    GPLUS_DASHER(734),
    GPLUS_DASHER_TAKEOUT(827),
    PAISA_MERCHANT_CONSOLE(688),
    GEO_DATA_UPLOAD_STAGING(1012),
    GEO_DATA_UPLOAD(690),
    GOOGLE_PLAY_SERVICES(80),
    GOOGLE_SETTINGS(81),
    THIRD_PARTY(100),
    PICASA_PHOTOS(101),
    GMAIL_HANGOUT(102),
    FOUNTAIN(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    FOUNTAIN_YOUTUBE(ErrorInfo.TYPE_SDU_FAILED),
    YOUTUBE_LEGACY_COMMENT_MIGRATION(547),
    FOUNTAIN_YOUTUBE_DISCUSS(119),
    FOUNTAIN_YOUTUBE_MESSAGES(160),
    YOUTUBE_AUTOSHARES(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    FOUNTAIN_YOUTUBE_LEGACY_GDATA(129),
    YOUTUBE_CHOWN_PIPELINE(627),
    FOUNTAIN_YOUTUBE_ACTIVITY_LOG(674),
    FOUNTAIN_YOUTUBE_ADMIN(675),
    FOCUS_FRONTEND(106),
    URL_SHAREBOX(107),
    READER(108),
    GOOGLE_MAIL(109),
    PLUS_SHARE(110),
    YOUTUBE(111),
    CHECKIN(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS),
    FRAMES(113),
    PHOTOS_CHROMEAPP(114),
    MOBILE_BASIC(115),
    GLASSWARE(116),
    GAMES(118),
    THIRD_PARTY_STREAM_EVERYWHERE_SINGLE_POST_WIDGET(120),
    PLAY_STORE(121),
    GMAIL_INBOX_POSTS(122),
    GMAIL_RECENT_POSTS(123),
    SIDECAR(124),
    GOOGLE_QUICK_SEARCH_BOX(125),
    WALLET(126),
    FRAMELESS_SHAREBOX(127),
    YOUTUBE_CAPTURE(128),
    YOUTUBE_WATCH_PAGE_SHARE(130),
    YOUTUBE_REACTR(168),
    YOUTUBE_MANGO(607),
    YOUTUBE_REACTR_TAKEOUT(682),
    YOUTUBE_COMMENTS_NOTIFICATION(670),
    GOOGLE_KEEP(131),
    VEGA(132),
    SOCIAL_REVIEWS(133),
    PLAY_MOVIES(134),
    GMAIL(135),
    HELPOUTS(136),
    MAPS(137),
    MAPS_ENGINE_MOBILE(138),
    CALENDAR(139),
    PLAY_NEWSSTAND(140),
    FITNESS(141),
    WEAR_HEALTH(611),
    WEAR_HEALTH_PROVISIONING(726),
    PLAY_BOOKS(142),
    INSTORE(143),
    PLAY_MUSIC(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD),
    GOOGLE_CHROME(145),
    LOCATION_FLARE(146),
    NEWS_WEATHER(147),
    PROMOTED_POSTS(148),
    CLOUD_PRINT(149),
    CLOUD_DEVICES(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED),
    CPANEL(MfiClientException.TYPE_MFICLIENT_NOT_FOUND),
    DRIVE(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED),
    CLASSROOM(MfiClientException.TYPE_MFICLIENT_STARTED),
    STORIES(MfiClientException.TYPE_MFICLIENT_NOT_STARTED),
    GOOGLE_ANALYTICS(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA),
    LOCATION_SAMPLE(MfiClientException.TYPE_NO_ACCOUNT_INFO),
    BIGTOP(MfiClientException.TYPE_CARD_NOT_CACHED),
    GOOGLE_CAST(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION),
    AUTHZEN(MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE),
    PARENTS(161),
    SEARCH(162),
    NEWS(163),
    DOCS(164),
    PHOTOS(165),
    PHOTOS_TAKEOUT(648),
    SIMBA_MOBILE(166),
    GOOGLE_JOBS(167),
    CLOUD_PLATFORM(169),
    CLOUD_PLATFORM_WEB(636),
    FIREFOX_BROWSER(170),
    MOVIEMAKER(171),
    MOVIEMAKER_PHOTOS(502),
    GOOGLE_STARS(172),
    SNAPSEED(173),
    BLOGGER(174),
    DEVICE_POLICY(175),
    DOUBLECLICK_CREATIVE_PREVIEW(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER),
    UNICORN(177),
    ADWORDS_MOBILE(178),
    FAMILY_COMPASS(179),
    AUTH_GRANT_CREDENTIAL(180),
    HALLWAY(181),
    FAMILY_CAMERA(182),
    ENDER(183),
    MAPS_VIEWS(184),
    TABLESCAPE(185),
    TOPAZ(186),
    FIBER(187),
    ATARI(188),
    RIDEMATCH(189),
    GMONEY(190),
    GOOGLE_EXPRESS(191),
    CONSUMER_PHOTO_EDITOR(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC),
    JETSTREAM(193),
    SOCIAL_SERENDIPITY(194),
    ONE_TODAY(195),
    PROFILES(196),
    SOCIAL_POLLS(197),
    SPACES(501),
    ADWORDS_EXPRESS(504),
    IDENTITY(505),
    IDENTITY_FRONTEND_VISUAL_ELEMENTS(749),
    YOUTUBE_BACKSTAGE(506),
    YOUTUBE_BACKSTAGE_ADMIN(654),
    YOUTUBE_UNPLUGGED(507),
    YOUTUBE_MUSIC(669),
    HUB(508),
    ANDROID_EDU_PROVISIONING(509),
    ANDROID_WEAR(510),
    CHROMECAST(511),
    ONTHEGO(512),
    ADSENSE(513),
    PROJECT_FI(514),
    JAM(515),
    HUDDLE(516),
    CAR_APP(517),
    TAILORMADE(518),
    ACTIVITY_LOG(519),
    SPACES_ACTIVITY_LOG(528),
    PHOTOS_ACTIVITY_LOG(543),
    MEMEGEN(529),
    SOCIETY(530),
    SOCIETY_CHAT(590),
    HIGHLIGHT(531),
    YOUTUBE_LIVE(536),
    YOUTUBE_LIVE_ACTIVITY_LOG(668),
    YOUTUBE_LIVE_TAKEOUT(678),
    CARDBOARD_CAMERA(520),
    PLAY_DEVELOPER_CONSOLE(521),
    MIXX(523),
    CHROME_REMOTE_DESKTOP(524),
    HOT_LANE(525),
    CONTACTS(527),
    CONTACTSHEET(717),
    HOVERCARD(718),
    DORY(722),
    SPECTRUM(532),
    DYNAMITE(534),
    DASHER_USER_HUB(535),
    CULTURAL(537),
    BOOND(538),
    EXPEDITIONS(541),
    PHOTO_ALBUM_ARCHIVE(542),
    GAMMAGO(548),
    FIREBALL(552),
    SUPPLY_CHAIN_CENTRAL(553),
    PAISA(555),
    SANDCLOCK(557),
    ACCOUNT_SETTINGS_MOBILE(560),
    GOOGLE_VOICE(561),
    WING_MARKETPLACE(564),
    CHIME(565),
    LIFESCIENCE_FRONTENDS(568),
    WYLO_TODAY(570),
    NAKSHA_CONSUMER(571),
    ENTERPRISE_ENROLLMENT(572),
    IMPROV(576),
    TRANSLATE(577),
    SOCIAL_ENGAGE(578),
    CORPCAM(580),
    ANDROID_CONTACTS(581),
    CURATOR(582),
    TRAVEL_BOOKING(583),
    SOCIAL_DISCOVERY(584),
    GPOST(585),
    PAIDTASKS(586),
    PRIMER(589),
    LOCAL_DISCOVERY(593),
    BASELINE(594),
    QUARTZ(595),
    DPANEL(596),
    TRIPS(597),
    HOME_SERVICES(598),
    SOCIALGOOD(599),
    LOUPE(600),
    UGC_LIVE_COMMENTS(601),
    FAMILY_LINK(602),
    G3DOC(604),
    MOMA(605),
    DASHER_ADMIN_CONSOLE(606),
    DASHER_COMMERCE_CONSOLE(1013),
    TRAVEL_VACATIONS(608),
    TRENDS(616),
    TASKS(617),
    VIMES(619),
    SECURITY_EVENT_MANAGER(620),
    VR_EVA(621),
    MINDSEARCH(622),
    MINDSEARCH_ADMIN(849),
    ANDROID_AUTO(623),
    CLOUDCAST_TEXTCHAT(624),
    APPS_ASSISTANT_OVERLAY(625),
    SEARCH_CONSOLE(629),
    CHROME_WEB_STORE(630),
    SAVE(631),
    FOOD_ORDERING(632),
    SOCIAL_RECOVERY(633),
    ANDROID_ONBOARD_WEB(634),
    WEAR_HOME(635),
    FACT_CHECK_EXPLORER(637),
    ALLO(638),
    FAMILY_LINK_HELPER(639),
    PROXY_GAL_PROVIDER(640),
    ONEGOOGLE(641),
    ONEGOOGLE_ASYNC(642),
    WICKED(643),
    SHEETS(644),
    SLIDES(645),
    ASSISTANT_EXPLORE_WEB(646),
    ASSISTANT_SETTINGS_WEB_UI(708),
    ANDROID_DIALER(647),
    KLOPFKLOPF(649),
    LAGEPLAN(650),
    SCIENCE_JOURNAL(651),
    HIRE(652),
    ZANDRIA(653),
    DASHER_RESELLER_FRONTEND(656),
    ZOOMSIGHTS(658),
    UGC_LIVE_COMMENTS_TAKEOUT(659),
    GUARDIAN(663),
    GUARDIAN_CORP(747),
    GOOGLE_MY_BUSINESS(664),
    PRESTO_ALP(676),
    PRESTO_FE(698),
    KIDS_HOME(666),
    OPA(672),
    SUBSCRIBEWITHGOOGLE_CLIENT(673),
    REVEAL(679),
    ANDROID_NATIVE_ONBOARDING(680),
    AMP_ACTIONS(681),
    SPOT(683),
    MEDICAL_SCRIBE(684),
    MEDICAL_SCRIBE_TASKING(705),
    DASHER_RULES_FRONTEND(685),
    ANDROID_TV_LAUNCHERX(686),
    ANDROID_TV_SETUP_WIZARD(796),
    SOS_LIVE_COMMENTS(689),
    GMAIL_LOCKER_UI(692),
    POLYGLOT(693),
    PLX(695),
    GROUPS_UI(696),
    MSV(700),
    WOLVERINE(706),
    MIC(707),
    FORMS(709),
    ARCORE(710),
    ANDROID_EMERGENCY(723),
    LENSLET(725),
    MEDICAL_LABELING(730),
    G_SUITE_ADD_ONS(731),
    LOCATION_HISTORY_CONSENT_ANDROID_LIBRARY(732),
    PAYMENTS_WEB_5(775),
    APPS_PLATFORM_CONSOLE(779),
    INTROSPECT(780),
    NGA(781),
    SUPPLY_CHAIN_HW_CHP2(782),
    DUC_COMPANION(783),
    AUTOMON(785),
    TV_LIVE_COMMENTS(812),
    GUP_PEEPS(813),
    FOCUS_SYNC_ADAPTER_V1(814),
    NOVA(815),
    NOVA_STAGING(816),
    GOOGLE_ADMIN(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    MESSAGE_PROCESSOR(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    EMAIL_PROCESSOR(202),
    ENGAGE_PIPELINE(203),
    AUTO_DOC_PROBER(204),
    DOC_PROBER(551),
    FRAMES_DELETE_SYNC(205),
    EMBEDS_MIGRATION(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    SOCIAL_REVIEWS_SYNC(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    GUNS(208),
    POSTBOX_ONEOFF(BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA),
    PLUS_API_ONEOFF(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA),
    STANZA_ACTIVITY_POST_DELETE_SYNC(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE),
    GRAPH_PROBER(BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD),
    STANZA_PERIODIC(BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED),
    MADISON_PERIODIC(522),
    PAPYRUS_PERIODIC(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE),
    PHOTOS_BACKEND(BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR),
    REDBOX_BACKEND(BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR),
    PHOTOS_FIFE(BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR),
    ABUSEIAM(BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT),
    ARES(701),
    STREAM_INDEXING(BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE),
    STANZA_INDEXING(220),
    STANZA(221),
    STANZA_MOONSHINE_INDEXING(579),
    STREAM_ACTIONS(750),
    STREAM_CONFIG(739),
    STREAM_SERVICE(222),
    STREAM_DELETE(556),
    KWYJIBO(223),
    STANZA_TEST(503),
    TEST_APPLICATION(526),
    SOCIAL_ANNOTATION_SERVICE(554),
    ANNOTATION_SERVICE_STANZA_LISTENER(539),
    SBE_PLAYGROUND(540),
    EXPO(544),
    ANDROID_VR_HOME(545),
    YOUTUBE_BLARNEY_STONE(546),
    SOCIAL_EVENTS(549),
    EMERGENCY_ASSIST(550),
    ADS_INTEGRITY_ENFORCER(603),
    ADS_INTEGRITY_ENFORCEMENT_MANAGER(610),
    ADS_INTEGRITY_EXPLORER(558),
    ADS_INTEGRITY_REVIEWER(559),
    GPLUS_COLLEXION_PIPELINE(563),
    GPLUS_OFFLINE(677),
    PAPYRUS(569),
    YOUTUBE_ADMIN(573),
    YOUTUBE_DECIDER(753),
    YOUTUBE_TNS_ACTION(840),
    YOUTUBE_EXTERNAL_LINKS(703),
    FOCUS_BACKEND_BATCH(574),
    DEPRECATED_QUICKSTART_FLUME(575),
    DUO_CLIENT(587),
    ALBERT(588),
    PEOPLE_PLAYGROUND(592),
    GPLUS_POST_RECOMMENDER(609),
    IMAGES(612),
    GOOGLE_STORE(613),
    GCONNECT_MUSTARD(614),
    MADDEN(615),
    MOBDOG(618),
    GBOARD(626),
    RECORDER(628),
    UNMAPPED_LEGACY_GPLUS_SOURCE(655),
    PODIUM(657),
    GSA_FUSE(661),
    HONEYPHISH(662),
    SOCIAL_ANNOTATION_SERVICE_BACKFILL(665),
    CONTACT_HR(671),
    PAISA_WANDER(691),
    NEXTGENRETAIL_SELF_ORDER(773),
    UNSET_APPLICATION(300),
    UNKNOWN_FIRST_PARTY_APPLICATION(ErrorInfo.TYPE_FSC_HTTP_ERROR),
    WABEL(117),
    VIDEO_HANGOUT(400),
    VIDEO_HANGOUT_LITE(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE),
    VIDEO_HANGOUT_GVC(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED),
    VIDEO_HANGOUT_PRESENT(403),
    VIDEO_HANGOUT_HOA(404),
    VIDEO_HANGOUT_TEE(405),
    VIDEO_HANGOUT_SDK(406),
    VIDEO_HANGOUT_ENVOY(409),
    BABEL(407),
    BABEL_NOVA(408),
    WABEL_MEDIACALL(410),
    HANGOUT_START_PAGE(411),
    EXPRESS_LANE(412),
    MEETINGS_ANDROID(413),
    EXPRESS_LANE_BOQ(414),
    RTC_FLEET_MGMT(415),
    STAX(562),
    RIGEL(566),
    PHOTOS_SCANNER(567),
    PHOTOS_LIBRARY_API(667),
    PHOTOS_PARTNER_API(795),
    VAULT(697),
    PROF(699),
    TOTAL(1000),
    TOTAL_ZERO_PARTY(1001),
    TOTAL_FIRST_PARTY(1002),
    TOTAL_THIRD_PARTY(1003),
    TOTAL_INTERNAL(1004),
    TOTAL_UNKNOWN(1005),
    TOTAL_MINUS_YOUTUBE(1006),
    TOTAL_FIRST_PARTY_WITH_PRIMARY_INTENT_TO_SHARE_TO_GPLUS(1007),
    TOTAL_FIRST_PARTY_WITH_SECONDARY_INTENT_TO_SHARE_TO_GPLUS(1008),
    TOTAL_GPLUS(1009),
    TOTAL_SOCIAL_APPS(1010),
    CROWD_COMPUTE(1011),
    KHAZANA(704),
    LIGHTER_GMM(711),
    LIGHTER_GMB(724),
    MYACTIVITY(712),
    BLOG_COMPASS(713),
    CONCORD(714),
    NAVSTAR(715),
    SETTINGS_INTELLIGENCE(716),
    TOPAZ_TEAMS(719),
    GEMAGENT(720),
    DUMBLEDORE(721),
    GOOGLE_ONE(727),
    NBU_GCONNECT_KIMCHI(728),
    FASTDASH(729),
    AQUARIUS_LAPIS(733),
    DASHER_REPORTING(735),
    GCONNECT_PICARD(736),
    GOOGLE_JACQUARD(737),
    GOOGLE_GO(738),
    BUGANIZER(740),
    DOCOS_MENTIONS(741),
    TRIX_WAFFLE(742),
    SHARE_SERVICE(743),
    ANDROID_SAFETY(744),
    CLOUDCAST_TEXTCHAT_TAKEOUT(745),
    ASSISTANT_GO(746),
    FLOURISH(748),
    ALECS(751),
    NANDHI(752),
    GOOGLE_RECORDER(754),
    CONTACT_STORE(755),
    PROFILE_CARD(756),
    ESPRESSO(757),
    PEOPLE_COMPANION(758),
    PHOTOS_GO(759),
    YETI(760),
    BLOOM(761),
    FIELD_OFFICER(762),
    URBAN_MOBILITY(763),
    FAMILYCARE(764),
    INTUITIVE_PLATFORM(765),
    NBU_CRICKET_WORLD_CUP(766),
    INTEGRATION_PLATFORM(767),
    CROS_SCALING_STAGING(768),
    CROS_SCALING_PROD(769),
    ASSISTANT_PROACTIVE_SUGGESTIONS(770),
    BULLETIN_CONTRIBUTOR(771),
    PRIVACY_ONE(772),
    PAISA_MERCHANT(774),
    ASSISTJS(776),
    TRAVEL_HOTELIER(777),
    PHOTOS_KINDYGRAM(778),
    ANDROID_MESSAGES(784),
    TRAVEL_HOTEL_EDITOR(786),
    VISTAAR(788),
    VISTAAR_DEV(789),
    GSUITE_GROWTH(790),
    ELDAR(791),
    GMB_ANDROID(792),
    SHOPPING_LIST(793),
    EARTH(794),
    PAISA_CREDIT_INSTANT_LOAN(797),
    ASSISTANT_GO_WEB(798),
    SHOWTIME_EVENTS(799),
    KONARK(800),
    EXO_REFSERVER(801),
    MONITORING_PLATFORM(802),
    AUTOCAP(803),
    PAYMENTS_ORCHESTRATION(804),
    GMB_IOS(805),
    ASSISTANT_KAIOS(806),
    ADMOB_MOBILE(807),
    SCREENERS(808),
    MILTON(809),
    GHIRE(810),
    TRANSLATE_COMMUNITY_UI(811),
    ROAD_MAPPER(817),
    NEST(818),
    ROLLOUTS_UI(819),
    SHOPPING_PROPERTY(820),
    SHOPPING_PROPERTY_NONPROD(821),
    PAYMENTS_MERCHANT_VERTICALS_GAS(822),
    PAISA_MOVIES(823),
    HUB_CALL(824),
    WAYMO_SIMULATION_RESULTS(825),
    GSUITE_WORKFLOWS(826),
    FINANCE_WORKFLOWS(828),
    PAYMENTS_MERCHANT_VERTICALS_PARKING_UI(829),
    TRAVEL(830),
    GABBLE(831),
    APPS_EDU(832),
    MYFI(833),
    CHOMCHOM(834),
    ASSISTANT_TOOLCHAIN(835),
    YOUTUBE_ANSIBLE(836),
    GANTRY(837),
    PAYMENTS_MERCHANT_CONSOLE(838),
    SPLINTER(839),
    KINTARO(841),
    MDM_ADMIN_CONSOLE(842),
    PAYMENTS_CONSUMER_CORE(843),
    INCIDENT_MANAGEMENT(844),
    ONEGOOGLE_MOBILE(845),
    ANURA(846),
    FINANCE_FGC(847),
    PODCASTS_MANAGER(848);
    

    /* renamed from: ja */
    public final int f168292ja;

    private byug(int i) {
        this.f168292ja = i;
    }

    /* renamed from: a */
    public static byug m125352a(int i) {
        if (i == 80) {
            return GOOGLE_PLAY_SERVICES;
        }
        if (i == 81) {
            return GOOGLE_SETTINGS;
        }
        if (i == 300) {
            return UNSET_APPLICATION;
        }
        if (i == 301) {
            return UNKNOWN_FIRST_PARTY_APPLICATION;
        }
        switch (i) {
            case 0:
                return UNKNOWN_APPLICATION;
            case 1:
                return GPLUS;
            case 2:
                return GPLUS_PHOTOS;
            case 3:
                return GPLUS_HANGOUT;
            case 4:
                return GPLUS_EVENTS;
            case 5:
                return GPLUS_SQUARES;
            case 6:
                return GPLUS_NOTIFICATIONS;
            case 7:
                return GPLUS_GAMES;
            case 8:
                return GPLUS_WHATS_HOT;
            case 9:
                return GPLUS_LOCAL;
            case 10:
                return GPLUS_PLUS_PAGES;
            case 11:
                return GPLUS_PROFILE;
            case 12:
                return GPLUS_FIND_PEOPLE;
            case 13:
                return GPLUS_PHOTO_EDITOR;
            case 14:
                return GPLUS_SOCIALCAST;
            default:
                switch (i) {
                    case 100:
                        return THIRD_PARTY;
                    case 101:
                        return PICASA_PHOTOS;
                    case 102:
                        return GMAIL_HANGOUT;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        return FOUNTAIN;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        return FOUNTAIN_YOUTUBE;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        return YOUTUBE_AUTOSHARES;
                    case 106:
                        return FOCUS_FRONTEND;
                    case 107:
                        return URL_SHAREBOX;
                    case 108:
                        return READER;
                    case 109:
                        return GOOGLE_MAIL;
                    case 110:
                        return PLUS_SHARE;
                    case 111:
                        return YOUTUBE;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS:
                        return CHECKIN;
                    case 113:
                        return FRAMES;
                    case 114:
                        return PHOTOS_CHROMEAPP;
                    case 115:
                        return MOBILE_BASIC;
                    case 116:
                        return GLASSWARE;
                    case 117:
                        return WABEL;
                    case 118:
                        return GAMES;
                    case 119:
                        return FOUNTAIN_YOUTUBE_DISCUSS;
                    case 120:
                        return THIRD_PARTY_STREAM_EVERYWHERE_SINGLE_POST_WIDGET;
                    case 121:
                        return PLAY_STORE;
                    case 122:
                        return GMAIL_INBOX_POSTS;
                    case 123:
                        return GMAIL_RECENT_POSTS;
                    case 124:
                        return SIDECAR;
                    case 125:
                        return GOOGLE_QUICK_SEARCH_BOX;
                    case 126:
                        return WALLET;
                    case 127:
                        return FRAMELESS_SHAREBOX;
                    case 128:
                        return YOUTUBE_CAPTURE;
                    case 129:
                        return FOUNTAIN_YOUTUBE_LEGACY_GDATA;
                    case 130:
                        return YOUTUBE_WATCH_PAGE_SHARE;
                    case 131:
                        return GOOGLE_KEEP;
                    case 132:
                        return VEGA;
                    case 133:
                        return SOCIAL_REVIEWS;
                    case 134:
                        return PLAY_MOVIES;
                    case 135:
                        return GMAIL;
                    case 136:
                        return HELPOUTS;
                    case 137:
                        return MAPS;
                    case 138:
                        return MAPS_ENGINE_MOBILE;
                    case 139:
                        return CALENDAR;
                    case 140:
                        return PLAY_NEWSSTAND;
                    case 141:
                        return FITNESS;
                    case 142:
                        return PLAY_BOOKS;
                    case 143:
                        return INSTORE;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD:
                        return PLAY_MUSIC;
                    case 145:
                        return GOOGLE_CHROME;
                    case 146:
                        return LOCATION_FLARE;
                    case 147:
                        return NEWS_WEATHER;
                    case 148:
                        return PROMOTED_POSTS;
                    case 149:
                        return CLOUD_PRINT;
                    case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                        return CLOUD_DEVICES;
                    case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                        return CPANEL;
                    case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                        return DRIVE;
                    case MfiClientException.TYPE_MFICLIENT_STARTED:
                        return CLASSROOM;
                    case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                        return STORIES;
                    case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                        return GOOGLE_ANALYTICS;
                    case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                        return LOCATION_SAMPLE;
                    case MfiClientException.TYPE_CARD_NOT_CACHED:
                        return BIGTOP;
                    case MfiClientException.TYPE_ILLEGAL_CARD_OPERATION:
                        return GOOGLE_CAST;
                    case MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE:
                        return AUTHZEN;
                    case 160:
                        return FOUNTAIN_YOUTUBE_MESSAGES;
                    case 161:
                        return PARENTS;
                    case 162:
                        return SEARCH;
                    case 163:
                        return NEWS;
                    case 164:
                        return DOCS;
                    case 165:
                        return PHOTOS;
                    case 166:
                        return SIMBA_MOBILE;
                    case 167:
                        return GOOGLE_JOBS;
                    case 168:
                        return YOUTUBE_REACTR;
                    case 169:
                        return CLOUD_PLATFORM;
                    case 170:
                        return FIREFOX_BROWSER;
                    case 171:
                        return MOVIEMAKER;
                    case 172:
                        return GOOGLE_STARS;
                    case 173:
                        return SNAPSEED;
                    case 174:
                        return BLOGGER;
                    case 175:
                        return DEVICE_POLICY;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER:
                        return DOUBLECLICK_CREATIVE_PREVIEW;
                    case 177:
                        return UNICORN;
                    case 178:
                        return ADWORDS_MOBILE;
                    case 179:
                        return FAMILY_COMPASS;
                    case 180:
                        return AUTH_GRANT_CREDENTIAL;
                    case 181:
                        return HALLWAY;
                    case 182:
                        return FAMILY_CAMERA;
                    case 183:
                        return ENDER;
                    case 184:
                        return MAPS_VIEWS;
                    case 185:
                        return TABLESCAPE;
                    case 186:
                        return TOPAZ;
                    case 187:
                        return FIBER;
                    case 188:
                        return ATARI;
                    case 189:
                        return RIDEMATCH;
                    case 190:
                        return GMONEY;
                    case 191:
                        return GOOGLE_EXPRESS;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC:
                        return CONSUMER_PHOTO_EDITOR;
                    case 193:
                        return JETSTREAM;
                    case 194:
                        return SOCIAL_SERENDIPITY;
                    case 195:
                        return ONE_TODAY;
                    case 196:
                        return PROFILES;
                    case 197:
                        return SOCIAL_POLLS;
                    case 198:
                        return GPLUS_PLUS_PAGES_RSS;
                    case ErrorInfo.TYPE_SDU_UNKNOWN:
                        return GPLUS_WEB;
                    case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                        return GOOGLE_ADMIN;
                    case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        return MESSAGE_PROCESSOR;
                    case 202:
                        return EMAIL_PROCESSOR;
                    case 203:
                        return ENGAGE_PIPELINE;
                    case 204:
                        return AUTO_DOC_PROBER;
                    case 205:
                        return FRAMES_DELETE_SYNC;
                    case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                        return EMBEDS_MIGRATION;
                    case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                        return SOCIAL_REVIEWS_SYNC;
                    case 208:
                        return GUNS;
                    case BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA:
                        return POSTBOX_ONEOFF;
                    case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                        return PLUS_API_ONEOFF;
                    case BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE:
                        return STANZA_ACTIVITY_POST_DELETE_SYNC;
                    case BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD:
                        return GRAPH_PROBER;
                    case BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED:
                        return STANZA_PERIODIC;
                    case BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE:
                        return PAPYRUS_PERIODIC;
                    case BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR:
                        return PHOTOS_BACKEND;
                    case BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR:
                        return REDBOX_BACKEND;
                    case BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR:
                        return PHOTOS_FIFE;
                    case BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT:
                        return ABUSEIAM;
                    case BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE:
                        return STREAM_INDEXING;
                    case 220:
                        return STANZA_INDEXING;
                    case 221:
                        return STANZA;
                    case 222:
                        return STREAM_SERVICE;
                    case 223:
                        return KWYJIBO;
                    default:
                        switch (i) {
                            case 400:
                                return VIDEO_HANGOUT;
                            case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                return VIDEO_HANGOUT_LITE;
                            case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                return VIDEO_HANGOUT_GVC;
                            case 403:
                                return VIDEO_HANGOUT_PRESENT;
                            case 404:
                                return VIDEO_HANGOUT_HOA;
                            case 405:
                                return VIDEO_HANGOUT_TEE;
                            case 406:
                                return VIDEO_HANGOUT_SDK;
                            case 407:
                                return BABEL;
                            case 408:
                                return BABEL_NOVA;
                            case 409:
                                return VIDEO_HANGOUT_ENVOY;
                            case 410:
                                return WABEL_MEDIACALL;
                            case 411:
                                return HANGOUT_START_PAGE;
                            case 412:
                                return EXPRESS_LANE;
                            case 413:
                                return MEETINGS_ANDROID;
                            case 414:
                                return EXPRESS_LANE_BOQ;
                            case 415:
                                return RTC_FLEET_MGMT;
                            default:
                                switch (i) {
                                    case 501:
                                        return SPACES;
                                    case 502:
                                        return MOVIEMAKER_PHOTOS;
                                    case 503:
                                        return STANZA_TEST;
                                    case 504:
                                        return ADWORDS_EXPRESS;
                                    case 505:
                                        return IDENTITY;
                                    case 506:
                                        return YOUTUBE_BACKSTAGE;
                                    case 507:
                                        return YOUTUBE_UNPLUGGED;
                                    case 508:
                                        return HUB;
                                    case 509:
                                        return ANDROID_EDU_PROVISIONING;
                                    case 510:
                                        return ANDROID_WEAR;
                                    case 511:
                                        return CHROMECAST;
                                    case 512:
                                        return ONTHEGO;
                                    case 513:
                                        return ADSENSE;
                                    case 514:
                                        return PROJECT_FI;
                                    case 515:
                                        return JAM;
                                    case 516:
                                        return HUDDLE;
                                    case 517:
                                        return CAR_APP;
                                    case 518:
                                        return TAILORMADE;
                                    case 519:
                                        return ACTIVITY_LOG;
                                    case 520:
                                        return CARDBOARD_CAMERA;
                                    case 521:
                                        return PLAY_DEVELOPER_CONSOLE;
                                    case 522:
                                        return MADISON_PERIODIC;
                                    case 523:
                                        return MIXX;
                                    case 524:
                                        return CHROME_REMOTE_DESKTOP;
                                    case 525:
                                        return HOT_LANE;
                                    case 526:
                                        return TEST_APPLICATION;
                                    case 527:
                                        return CONTACTS;
                                    case 528:
                                        return SPACES_ACTIVITY_LOG;
                                    case 529:
                                        return MEMEGEN;
                                    case 530:
                                        return SOCIETY;
                                    case 531:
                                        return HIGHLIGHT;
                                    case 532:
                                        return SPECTRUM;
                                    default:
                                        switch (i) {
                                            case 534:
                                                return DYNAMITE;
                                            case 535:
                                                return DASHER_USER_HUB;
                                            case 536:
                                                return YOUTUBE_LIVE;
                                            case 537:
                                                return CULTURAL;
                                            case 538:
                                                return BOOND;
                                            case 539:
                                                return ANNOTATION_SERVICE_STANZA_LISTENER;
                                            case 540:
                                                return SBE_PLAYGROUND;
                                            case 541:
                                                return EXPEDITIONS;
                                            case 542:
                                                return PHOTO_ALBUM_ARCHIVE;
                                            case 543:
                                                return PHOTOS_ACTIVITY_LOG;
                                            case 544:
                                                return EXPO;
                                            case 545:
                                                return ANDROID_VR_HOME;
                                            case 546:
                                                return YOUTUBE_BLARNEY_STONE;
                                            case 547:
                                                return YOUTUBE_LEGACY_COMMENT_MIGRATION;
                                            case 548:
                                                return GAMMAGO;
                                            case 549:
                                                return SOCIAL_EVENTS;
                                            case 550:
                                                return EMERGENCY_ASSIST;
                                            case 551:
                                                return DOC_PROBER;
                                            case 552:
                                                return FIREBALL;
                                            case 553:
                                                return SUPPLY_CHAIN_CENTRAL;
                                            case 554:
                                                return SOCIAL_ANNOTATION_SERVICE;
                                            case 555:
                                                return PAISA;
                                            case 556:
                                                return STREAM_DELETE;
                                            case 557:
                                                return SANDCLOCK;
                                            case 558:
                                                return ADS_INTEGRITY_EXPLORER;
                                            case 559:
                                                return ADS_INTEGRITY_REVIEWER;
                                            case 560:
                                                return ACCOUNT_SETTINGS_MOBILE;
                                            case 561:
                                                return GOOGLE_VOICE;
                                            case 562:
                                                return STAX;
                                            case 563:
                                                return GPLUS_COLLEXION_PIPELINE;
                                            case 564:
                                                return WING_MARKETPLACE;
                                            case 565:
                                                return CHIME;
                                            case 566:
                                                return RIGEL;
                                            case 567:
                                                return PHOTOS_SCANNER;
                                            case 568:
                                                return LIFESCIENCE_FRONTENDS;
                                            case 569:
                                                return PAPYRUS;
                                            case 570:
                                                return WYLO_TODAY;
                                            case 571:
                                                return NAKSHA_CONSUMER;
                                            case 572:
                                                return ENTERPRISE_ENROLLMENT;
                                            case 573:
                                                return YOUTUBE_ADMIN;
                                            case 574:
                                                return FOCUS_BACKEND_BATCH;
                                            case 575:
                                                return DEPRECATED_QUICKSTART_FLUME;
                                            case 576:
                                                return IMPROV;
                                            case 577:
                                                return TRANSLATE;
                                            case 578:
                                                return SOCIAL_ENGAGE;
                                            case 579:
                                                return STANZA_MOONSHINE_INDEXING;
                                            case 580:
                                                return CORPCAM;
                                            case 581:
                                                return ANDROID_CONTACTS;
                                            case 582:
                                                return CURATOR;
                                            case 583:
                                                return TRAVEL_BOOKING;
                                            case 584:
                                                return SOCIAL_DISCOVERY;
                                            case 585:
                                                return GPOST;
                                            case 586:
                                                return PAIDTASKS;
                                            case 587:
                                                return DUO_CLIENT;
                                            case 588:
                                                return ALBERT;
                                            case 589:
                                                return PRIMER;
                                            case 590:
                                                return SOCIETY_CHAT;
                                            case 591:
                                                return GPLUS_INTERACTION_EVENTS;
                                            case 592:
                                                return PEOPLE_PLAYGROUND;
                                            case 593:
                                                return LOCAL_DISCOVERY;
                                            case 594:
                                                return BASELINE;
                                            case 595:
                                                return QUARTZ;
                                            case 596:
                                                return DPANEL;
                                            case 597:
                                                return TRIPS;
                                            case 598:
                                                return HOME_SERVICES;
                                            case 599:
                                                return SOCIALGOOD;
                                            case 600:
                                                return LOUPE;
                                            case 601:
                                                return UGC_LIVE_COMMENTS;
                                            case 602:
                                                return FAMILY_LINK;
                                            case 603:
                                                return ADS_INTEGRITY_ENFORCER;
                                            case 604:
                                                return G3DOC;
                                            case 605:
                                                return MOMA;
                                            case 606:
                                                return DASHER_ADMIN_CONSOLE;
                                            case 607:
                                                return YOUTUBE_MANGO;
                                            case 608:
                                                return TRAVEL_VACATIONS;
                                            case 609:
                                                return GPLUS_POST_RECOMMENDER;
                                            case 610:
                                                return ADS_INTEGRITY_ENFORCEMENT_MANAGER;
                                            case 611:
                                                return WEAR_HEALTH;
                                            case 612:
                                                return IMAGES;
                                            case 613:
                                                return GOOGLE_STORE;
                                            case 614:
                                                return GCONNECT_MUSTARD;
                                            case 615:
                                                return MADDEN;
                                            case 616:
                                                return TRENDS;
                                            case 617:
                                                return TASKS;
                                            case 618:
                                                return MOBDOG;
                                            case 619:
                                                return VIMES;
                                            case 620:
                                                return SECURITY_EVENT_MANAGER;
                                            case 621:
                                                return VR_EVA;
                                            case 622:
                                                return MINDSEARCH;
                                            case 623:
                                                return ANDROID_AUTO;
                                            case 624:
                                                return CLOUDCAST_TEXTCHAT;
                                            case 625:
                                                return APPS_ASSISTANT_OVERLAY;
                                            case 626:
                                                return GBOARD;
                                            case 627:
                                                return YOUTUBE_CHOWN_PIPELINE;
                                            case 628:
                                                return RECORDER;
                                            case 629:
                                                return SEARCH_CONSOLE;
                                            case 630:
                                                return CHROME_WEB_STORE;
                                            case 631:
                                                return SAVE;
                                            case 632:
                                                return FOOD_ORDERING;
                                            case 633:
                                                return SOCIAL_RECOVERY;
                                            case 634:
                                                return ANDROID_ONBOARD_WEB;
                                            case 635:
                                                return WEAR_HOME;
                                            case 636:
                                                return CLOUD_PLATFORM_WEB;
                                            case 637:
                                                return FACT_CHECK_EXPLORER;
                                            case 638:
                                                return ALLO;
                                            case 639:
                                                return FAMILY_LINK_HELPER;
                                            case 640:
                                                return PROXY_GAL_PROVIDER;
                                            case 641:
                                                return ONEGOOGLE;
                                            case 642:
                                                return ONEGOOGLE_ASYNC;
                                            case 643:
                                                return WICKED;
                                            case 644:
                                                return SHEETS;
                                            case 645:
                                                return SLIDES;
                                            case 646:
                                                return ASSISTANT_EXPLORE_WEB;
                                            case 647:
                                                return ANDROID_DIALER;
                                            case 648:
                                                return PHOTOS_TAKEOUT;
                                            case 649:
                                                return KLOPFKLOPF;
                                            case 650:
                                                return LAGEPLAN;
                                            case 651:
                                                return SCIENCE_JOURNAL;
                                            case 652:
                                                return HIRE;
                                            case 653:
                                                return ZANDRIA;
                                            case 654:
                                                return YOUTUBE_BACKSTAGE_ADMIN;
                                            case 655:
                                                return UNMAPPED_LEGACY_GPLUS_SOURCE;
                                            case 656:
                                                return DASHER_RESELLER_FRONTEND;
                                            case 657:
                                                return PODIUM;
                                            case 658:
                                                return ZOOMSIGHTS;
                                            case 659:
                                                return UGC_LIVE_COMMENTS_TAKEOUT;
                                            case 660:
                                                return GPLUS_ENTITY_TRANSFER;
                                            case 661:
                                                return GSA_FUSE;
                                            case 662:
                                                return HONEYPHISH;
                                            case 663:
                                                return GUARDIAN;
                                            case 664:
                                                return GOOGLE_MY_BUSINESS;
                                            case 665:
                                                return SOCIAL_ANNOTATION_SERVICE_BACKFILL;
                                            case 666:
                                                return KIDS_HOME;
                                            case 667:
                                                return PHOTOS_LIBRARY_API;
                                            case 668:
                                                return YOUTUBE_LIVE_ACTIVITY_LOG;
                                            case 669:
                                                return YOUTUBE_MUSIC;
                                            case 670:
                                                return YOUTUBE_COMMENTS_NOTIFICATION;
                                            case 671:
                                                return CONTACT_HR;
                                            case 672:
                                                return OPA;
                                            case 673:
                                                return SUBSCRIBEWITHGOOGLE_CLIENT;
                                            case 674:
                                                return FOUNTAIN_YOUTUBE_ACTIVITY_LOG;
                                            case 675:
                                                return FOUNTAIN_YOUTUBE_ADMIN;
                                            case 676:
                                                return PRESTO_ALP;
                                            case 677:
                                                return GPLUS_OFFLINE;
                                            case 678:
                                                return YOUTUBE_LIVE_TAKEOUT;
                                            case 679:
                                                return REVEAL;
                                            case 680:
                                                return ANDROID_NATIVE_ONBOARDING;
                                            case 681:
                                                return AMP_ACTIONS;
                                            case 682:
                                                return YOUTUBE_REACTR_TAKEOUT;
                                            case 683:
                                                return SPOT;
                                            case 684:
                                                return MEDICAL_SCRIBE;
                                            case 685:
                                                return DASHER_RULES_FRONTEND;
                                            case 686:
                                                return ANDROID_TV_LAUNCHERX;
                                            case 687:
                                                return GPLUS_LIS;
                                            case 688:
                                                return PAISA_MERCHANT_CONSOLE;
                                            case 689:
                                                return SOS_LIVE_COMMENTS;
                                            case 690:
                                                return GEO_DATA_UPLOAD;
                                            case 691:
                                                return PAISA_WANDER;
                                            case 692:
                                                return GMAIL_LOCKER_UI;
                                            case 693:
                                                return POLYGLOT;
                                            case 694:
                                                return GPLUS_ARES_FEATURE_PROVIDER;
                                            case 695:
                                                return PLX;
                                            case 696:
                                                return GROUPS_UI;
                                            case 697:
                                                return VAULT;
                                            case 698:
                                                return PRESTO_FE;
                                            case 699:
                                                return PROF;
                                            case 700:
                                                return MSV;
                                            case 701:
                                                return ARES;
                                            case 702:
                                                return GPLUS_DRAWBRIDGE;
                                            case 703:
                                                return YOUTUBE_EXTERNAL_LINKS;
                                            case 704:
                                                return KHAZANA;
                                            case 705:
                                                return MEDICAL_SCRIBE_TASKING;
                                            case 706:
                                                return WOLVERINE;
                                            case 707:
                                                return MIC;
                                            case 708:
                                                return ASSISTANT_SETTINGS_WEB_UI;
                                            case 709:
                                                return FORMS;
                                            case 710:
                                                return ARCORE;
                                            case 711:
                                                return LIGHTER_GMM;
                                            case 712:
                                                return MYACTIVITY;
                                            case 713:
                                                return BLOG_COMPASS;
                                            case 714:
                                                return CONCORD;
                                            case 715:
                                                return NAVSTAR;
                                            case 716:
                                                return SETTINGS_INTELLIGENCE;
                                            case 717:
                                                return CONTACTSHEET;
                                            case 718:
                                                return HOVERCARD;
                                            case 719:
                                                return TOPAZ_TEAMS;
                                            case 720:
                                                return GEMAGENT;
                                            case 721:
                                                return DUMBLEDORE;
                                            case 722:
                                                return DORY;
                                            case 723:
                                                return ANDROID_EMERGENCY;
                                            case 724:
                                                return LIGHTER_GMB;
                                            case 725:
                                                return LENSLET;
                                            case 726:
                                                return WEAR_HEALTH_PROVISIONING;
                                            case 727:
                                                return GOOGLE_ONE;
                                            case 728:
                                                return NBU_GCONNECT_KIMCHI;
                                            case 729:
                                                return FASTDASH;
                                            case 730:
                                                return MEDICAL_LABELING;
                                            case 731:
                                                return G_SUITE_ADD_ONS;
                                            case 732:
                                                return LOCATION_HISTORY_CONSENT_ANDROID_LIBRARY;
                                            case 733:
                                                return AQUARIUS_LAPIS;
                                            case 734:
                                                return GPLUS_DASHER;
                                            case 735:
                                                return DASHER_REPORTING;
                                            case 736:
                                                return GCONNECT_PICARD;
                                            case 737:
                                                return GOOGLE_JACQUARD;
                                            case 738:
                                                return GOOGLE_GO;
                                            case 739:
                                                return STREAM_CONFIG;
                                            case 740:
                                                return BUGANIZER;
                                            case 741:
                                                return DOCOS_MENTIONS;
                                            case 742:
                                                return TRIX_WAFFLE;
                                            case 743:
                                                return SHARE_SERVICE;
                                            case 744:
                                                return ANDROID_SAFETY;
                                            case 745:
                                                return CLOUDCAST_TEXTCHAT_TAKEOUT;
                                            case 746:
                                                return ASSISTANT_GO;
                                            case 747:
                                                return GUARDIAN_CORP;
                                            case 748:
                                                return FLOURISH;
                                            case 749:
                                                return IDENTITY_FRONTEND_VISUAL_ELEMENTS;
                                            case 750:
                                                return STREAM_ACTIONS;
                                            case 751:
                                                return ALECS;
                                            case 752:
                                                return NANDHI;
                                            case 753:
                                                return YOUTUBE_DECIDER;
                                            case 754:
                                                return GOOGLE_RECORDER;
                                            case 755:
                                                return CONTACT_STORE;
                                            case 756:
                                                return PROFILE_CARD;
                                            case 757:
                                                return ESPRESSO;
                                            case 758:
                                                return PEOPLE_COMPANION;
                                            case 759:
                                                return PHOTOS_GO;
                                            case 760:
                                                return YETI;
                                            case 761:
                                                return BLOOM;
                                            case 762:
                                                return FIELD_OFFICER;
                                            case 763:
                                                return URBAN_MOBILITY;
                                            case 764:
                                                return FAMILYCARE;
                                            case 765:
                                                return INTUITIVE_PLATFORM;
                                            case 766:
                                                return NBU_CRICKET_WORLD_CUP;
                                            case 767:
                                                return INTEGRATION_PLATFORM;
                                            case 768:
                                                return CROS_SCALING_STAGING;
                                            case 769:
                                                return CROS_SCALING_PROD;
                                            case 770:
                                                return ASSISTANT_PROACTIVE_SUGGESTIONS;
                                            case 771:
                                                return BULLETIN_CONTRIBUTOR;
                                            case 772:
                                                return PRIVACY_ONE;
                                            case 773:
                                                return NEXTGENRETAIL_SELF_ORDER;
                                            case 774:
                                                return PAISA_MERCHANT;
                                            case 775:
                                                return PAYMENTS_WEB_5;
                                            case 776:
                                                return ASSISTJS;
                                            case 777:
                                                return TRAVEL_HOTELIER;
                                            case 778:
                                                return PHOTOS_KINDYGRAM;
                                            case 779:
                                                return APPS_PLATFORM_CONSOLE;
                                            case 780:
                                                return INTROSPECT;
                                            case 781:
                                                return NGA;
                                            case 782:
                                                return SUPPLY_CHAIN_HW_CHP2;
                                            case 783:
                                                return DUC_COMPANION;
                                            case 784:
                                                return ANDROID_MESSAGES;
                                            case 785:
                                                return AUTOMON;
                                            case 786:
                                                return TRAVEL_HOTEL_EDITOR;
                                            default:
                                                switch (i) {
                                                    case 788:
                                                        return VISTAAR;
                                                    case 789:
                                                        return VISTAAR_DEV;
                                                    case 790:
                                                        return GSUITE_GROWTH;
                                                    case 791:
                                                        return ELDAR;
                                                    case 792:
                                                        return GMB_ANDROID;
                                                    case 793:
                                                        return SHOPPING_LIST;
                                                    case 794:
                                                        return EARTH;
                                                    case 795:
                                                        return PHOTOS_PARTNER_API;
                                                    case 796:
                                                        return ANDROID_TV_SETUP_WIZARD;
                                                    case 797:
                                                        return PAISA_CREDIT_INSTANT_LOAN;
                                                    case 798:
                                                        return ASSISTANT_GO_WEB;
                                                    case 799:
                                                        return SHOWTIME_EVENTS;
                                                    case 800:
                                                        return KONARK;
                                                    case 801:
                                                        return EXO_REFSERVER;
                                                    case 802:
                                                        return MONITORING_PLATFORM;
                                                    case 803:
                                                        return AUTOCAP;
                                                    case 804:
                                                        return PAYMENTS_ORCHESTRATION;
                                                    case 805:
                                                        return GMB_IOS;
                                                    case 806:
                                                        return ASSISTANT_KAIOS;
                                                    case 807:
                                                        return ADMOB_MOBILE;
                                                    case 808:
                                                        return SCREENERS;
                                                    case 809:
                                                        return MILTON;
                                                    case 810:
                                                        return GHIRE;
                                                    case 811:
                                                        return TRANSLATE_COMMUNITY_UI;
                                                    case 812:
                                                        return TV_LIVE_COMMENTS;
                                                    case 813:
                                                        return GUP_PEEPS;
                                                    case 814:
                                                        return FOCUS_SYNC_ADAPTER_V1;
                                                    case 815:
                                                        return NOVA;
                                                    case 816:
                                                        return NOVA_STAGING;
                                                    case 817:
                                                        return ROAD_MAPPER;
                                                    case 818:
                                                        return NEST;
                                                    case 819:
                                                        return ROLLOUTS_UI;
                                                    case 820:
                                                        return SHOPPING_PROPERTY;
                                                    case 821:
                                                        return SHOPPING_PROPERTY_NONPROD;
                                                    case 822:
                                                        return PAYMENTS_MERCHANT_VERTICALS_GAS;
                                                    case 823:
                                                        return PAISA_MOVIES;
                                                    case 824:
                                                        return HUB_CALL;
                                                    case 825:
                                                        return WAYMO_SIMULATION_RESULTS;
                                                    case 826:
                                                        return GSUITE_WORKFLOWS;
                                                    case 827:
                                                        return GPLUS_DASHER_TAKEOUT;
                                                    case 828:
                                                        return FINANCE_WORKFLOWS;
                                                    case 829:
                                                        return PAYMENTS_MERCHANT_VERTICALS_PARKING_UI;
                                                    case 830:
                                                        return TRAVEL;
                                                    case 831:
                                                        return GABBLE;
                                                    case 832:
                                                        return APPS_EDU;
                                                    case 833:
                                                        return MYFI;
                                                    case 834:
                                                        return CHOMCHOM;
                                                    case 835:
                                                        return ASSISTANT_TOOLCHAIN;
                                                    case 836:
                                                        return YOUTUBE_ANSIBLE;
                                                    case 837:
                                                        return GANTRY;
                                                    case 838:
                                                        return PAYMENTS_MERCHANT_CONSOLE;
                                                    case 839:
                                                        return SPLINTER;
                                                    case 840:
                                                        return YOUTUBE_TNS_ACTION;
                                                    case 841:
                                                        return KINTARO;
                                                    case 842:
                                                        return MDM_ADMIN_CONSOLE;
                                                    case 843:
                                                        return PAYMENTS_CONSUMER_CORE;
                                                    case 844:
                                                        return INCIDENT_MANAGEMENT;
                                                    case 845:
                                                        return ONEGOOGLE_MOBILE;
                                                    case 846:
                                                        return ANURA;
                                                    case 847:
                                                        return FINANCE_FGC;
                                                    case 848:
                                                        return PODCASTS_MANAGER;
                                                    case 849:
                                                        return MINDSEARCH_ADMIN;
                                                    default:
                                                        switch (i) {
                                                            case 1000:
                                                                return TOTAL;
                                                            case 1001:
                                                                return TOTAL_ZERO_PARTY;
                                                            case 1002:
                                                                return TOTAL_FIRST_PARTY;
                                                            case 1003:
                                                                return TOTAL_THIRD_PARTY;
                                                            case 1004:
                                                                return TOTAL_INTERNAL;
                                                            case 1005:
                                                                return TOTAL_UNKNOWN;
                                                            case 1006:
                                                                return TOTAL_MINUS_YOUTUBE;
                                                            case 1007:
                                                                return TOTAL_FIRST_PARTY_WITH_PRIMARY_INTENT_TO_SHARE_TO_GPLUS;
                                                            case 1008:
                                                                return TOTAL_FIRST_PARTY_WITH_SECONDARY_INTENT_TO_SHARE_TO_GPLUS;
                                                            case 1009:
                                                                return TOTAL_GPLUS;
                                                            case 1010:
                                                                return TOTAL_SOCIAL_APPS;
                                                            case 1011:
                                                                return CROWD_COMPUTE;
                                                            case 1012:
                                                                return GEO_DATA_UPLOAD_STAGING;
                                                            case 1013:
                                                                return DASHER_COMMERCE_CONSOLE;
                                                            default:
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static bxvr m125353b() {
        return byuf.f167770a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f168292ja;
    }

    public final String toString() {
        return Integer.toString(this.f168292ja);
    }
}
